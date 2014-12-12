/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mov;

import java.util.ArrayList;
import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

/**
 *
 * @author Sakuni
 */
public class Classify {

    static ArrayList<String> classVal = new ArrayList();
    private static Classify classify_instence;
    private String MODEL_LOCATION = "D:\\Final\\model3.model";
   // private String ARFF_LOCATION = "mvlist2.arff";

    private Classify() {
        Arff a = Arff.getArffInstence();
        if (a.getList().isEmpty()) {
            System.err.println("Error While creating class values. Assigning default values!");
            classVal.add("Adult");
            classVal.add("Comedy");
            classVal.add("Action");
            classVal.add("Romance");
            classVal.add("Horror");
        } else {
            classVal = a.getList();
        }

    }

    public static Classify getClassifyInstance() { // making this class as a singleton
        if (classify_instence == null) {
            classify_instence = new Classify();
        }
        return classify_instence;
    }

    public void setMODEL_LOCATION(String MODEL_LOCATION) {
        this.MODEL_LOCATION = MODEL_LOCATION;
        System.out.println("setting Model Location: " + MODEL_LOCATION);
    }

    public String getMODEL_LOCATION() {
        return MODEL_LOCATION;
    }
    

    //===========================================================================
    public double classify_plot(String plot) { 

        // This method reads the existing model and classify a new plot
        double result = -1;
        try {

            ArrayList<Attribute> attributeList = new ArrayList();

            Attribute at_plot = new Attribute("plot", (FastVector) null); // create the plot attribute as a string

            Attribute at_cat = new Attribute("@@Category@@", classVal); // creating the category  attibute as a class attribute
            attributeList.add(at_plot); // adding attributes to the array list
            attributeList.add(at_cat); 
            
            // creating a new instance
            Instances data = new Instances("TestInstances", attributeList, 0);


            // Create instances for each category with attribute values
            // plot itself
            Instance inst_co = new DenseInstance(2);  

            data.add(inst_co);
            inst_co.setDataset(data);
           
            inst_co.setValue(at_plot, plot);
            
            System.out.println("number of attributes: " + inst_co.numAttributes());
            inst_co.setMissing(at_cat); // set category as missing

            data.setClassIndex(1);
            // load classifier from file
            Classifier cls_co = (Classifier) weka.core.SerializationHelper.read(MODEL_LOCATION); // read model from file
            System.out.println("classindex: " + inst_co.classIndex());
            result = cls_co.classifyInstance(inst_co); // classify new plot
            System.out.println(plot + "\n : " + classVal.get((int) result));
            
        } catch (Exception e) {
            
                e.printStackTrace();
        }
        return result;
    }

    
}