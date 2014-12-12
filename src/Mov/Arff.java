/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mov;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Sakuni
 */

/**
 * 
 * Reading the genre and plot list files and creating the arff with plot and genre as attributes.
 * genre.list consist of movie name and genre
 * plot.list consist of movie name and plot
 */

public class Arff {

    private static Arff arff_instence;

    private Arff() {
        intialize();
    }

    public static Arff getArffInstence() { // get Arff singleton
        if (arff_instence == null) {
            arff_instence = new Arff();
        }
        return arff_instence;
    }

    private String GENRES_FILE = "genres.txt";
    private String PLOT_FILE = "plot.txt";
    private String MVLIST = "mvlist2.arff";

    static final int ENTRIES = 750000; // number of plots considered
    ArrayList<String> list = new ArrayList(); // list of categories initialized
    ArrayList<String> list2; // copy of the list. The entries of this list is removed when creating the arff
    HashMap<String, String> genremap = new HashMap(); // hashmap with movie name<String> and the category<String>
    HashMap<String, Integer> cat = new HashMap(); // hashmap with category and the number of related plots

    public void setMVLIST(String MVLIST) {
        this.MVLIST = MVLIST;
        System.out.println("Arff, MVLIST: " + MVLIST);
    }

    public void setPLOT_FILE(String PLOT_FILE) {
        this.PLOT_FILE = PLOT_FILE;
        System.out.println("Arff, PLOT_FILE: " + PLOT_FILE);
    }

    public void setGENRES_FILE(String GENRES_FILE) {
        this.GENRES_FILE = GENRES_FILE;
        System.out.println("Arff, GENRES_FILE: " + GENRES_FILE);
    }

    public String getGENRES_FILE() {
        return GENRES_FILE;
    }

    public String getMVLIST() {
        return MVLIST;
    }

   

    public String getPLOT_FILE() {
        return PLOT_FILE;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void readGenres() throws IOException {
        /* Reading the raw genre.list file and fill the genremap */
        System.out.println("Reading Genres...");
        Path path = Paths.get(GENRES_FILE);
        String s = "";
        String[] sa;
        int i = 0;
        try (Scanner scanner = new Scanner(path)) { //, ENCODING.name()
            while (scanner.hasNextLine() && i < ENTRIES * 2) {
                i++;
                s = scanner.nextLine();
                sa = s.trim().split("\t"); // sa is the word array seperated by tabs 
                //System.out.println(""+sa[0]);
                //System.out.println(""+sa[sa.length-1]);
                if (genremap.containsKey(sa[0])) { // avoiding duplicate genres
                    continue;
                }
                genremap.put(sa[0], sa[sa.length - 1]); // movie name(key) and genre(value) seperated
            }
        }

    }

    public void creatArff() throws IOException {
        /* Reading the plot file and get the movie name,compare and write the file in arff format */
        System.out.println("Creating .arff ...");
        Path path2 = Paths.get(MVLIST); // output arff file path
        // Path temppath = Paths.get(TEMPFILE);
        Path path = Paths.get(PLOT_FILE); // input plot.list file path
        // creating a new bufferedwriter to write to the MVLIST
        BufferedWriter writer = Files.newBufferedWriter(path2, StandardCharsets.UTF_8);

        // writing the header of the arff file
        writer.write("@relation IMDB_Reviewes");
        writer.newLine();
        writer.newLine();
        writer.write("@attribute Plot string");
        writer.newLine();
        String temp = "@attribute Category {";
        for (String line : list) { // getting initialized categories comma seperatedly
            temp = temp + line + ",";
        }
        temp = temp.substring(0, temp.length() - 1) + "}";
        writer.write(temp);
        writer.newLine();
        writer.newLine();
        writer.write("@data");
        writer.newLine();

        String s; //line that reads
        String plot; // plot
        String mvn; //movie name
        String mv_year;
        cat.put("Total", 0); // to keep track of total no of plots
        int i = 0;

        // itterate through the plot file and creating the arff entries
        try (Scanner scanner = new Scanner(path)) { //, ENCODING.name()
            while (scanner.hasNextLine() && i < ENTRIES) {

                plot = "";
                s = scanner.nextLine(); // MV: "Making a Splash" (2015) or PL: With a burglar ......
                if (s.startsWith("MV:")) { // if movie name is read
                    mvn = s.substring(4, s.indexOf(")") + 1).trim();
                    mv_year = mvn.substring(mvn.indexOf("(") + 1, mvn.indexOf(")"));
                    if (mv_year.equals("2014") || mv_year.equals("2015")) { // removing 2014 & 2015 movies
                        continue;
                    }
                    scanner.nextLine();
                    s = scanner.nextLine();
                    while (s.startsWith("PL:")) { // reading the plot to a string
                        plot = plot + s.substring(4);
                        s = scanner.nextLine();

                    }
                    plot = plot.replace("'", "\\'").replace("\"", "\\\""); // arff format

                    if (genremap.containsKey(mvn) && list2.contains(genremap.get(mvn))) { // list2.contains means entries less than 500 for that genre
                        i++;
                        writer.newLine();
                        if (cat.containsKey(genremap.get(mvn))) { // if cat hashmap has the genre
                            cat.put(genremap.get(mvn), cat.get(genremap.get(mvn)) + 1); // category and the number of related plots
                            if (cat.get(genremap.get(mvn)) >= 500) { // removing category from list2 if number of plots exceeds 500
                                list2.remove(genremap.get(mvn));
                            }
                            cat.put("Total", cat.get("Total") + 1); // increase the total for every entry
                        } else {
                            cat.put(genremap.get(mvn), 1);
                            cat.put("Total", cat.get("Total") + 1);
                        }
                        writer.write("'" + plot + "'," + genremap.get(mvn)); // write the new entry 
                        writer.newLine();
                        writer.flush();
                    }
                }
            }

            for (Map.Entry<String, Integer> entry : cat.entrySet()) { // displaying the total
                String string = entry.getKey();
                Integer val = entry.getValue();
                System.out.println(string + " - " + val);
            }

            writer.close();
        }
    }



    private void intialize() {
        list.add("Adult");
        list.add("Comedy");
        list.add("Action");
        //list.add("Western");
        //list.add("Family");
        //list.add("Reality-TV");
        //list.add("Drama");
        //list.add("Documentary");
        //list.add("Adventure");
        //list.add("Animation");
        list.add("Romance");
        list.add("Horror");
        list2 = new ArrayList<>(list); // copy of the list
    }

    public static void main(String[] args) {
      
        NewPlotUI ui = new NewPlotUI();
        ui.ShowUI();

    }
}
