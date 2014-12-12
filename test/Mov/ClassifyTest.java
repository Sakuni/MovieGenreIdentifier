/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mov;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sakuni
 */
public class ClassifyTest {

    Classify instance;

    public ClassifyTest() {
        instance = Classify.getClassifyInstance();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of classify_plot method, of class Classify.
     */
    @Test
    public void testClassify_plot() {
        String plot = ("When his brother is killed in a robbery, paraplegic Marine Jake Sully decides to take his place in a mission on the distant world of Pandora. There he learns of greedy corporate figurehead Parker Selfridge's intentions of driving off the native humanoid \"Na'vi\" in order to mine for the precious material scattered throughout their rich woodland. In exchange for the spinal surgery that will fix his legs, Jake gathers intel for the cooperating military unit spearheaded by gung-ho Colonel Quaritch, while simultaneously attempting to infiltrate the Na'vi people with the use of an \"avatar\" identity. While Jake begins to bond with the native tribe and quickly falls in love with the beautiful alien Neytiri, the restless Colonel moves forward with his ruthless extermination tactics, forcing the soldier to take a stand - and fight back in an epic battle for the fate of Pandora.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot1() {

        String plot1 = ("Elmira follows the story of a bunch of strangers who all respond to thesame CraigsList ad \"Looking for roommates to share rent.\" Upon theirarrival, the apartment is a lot smaller than anticipated, and so the flatis overpopulated. The fictional apartment building, \"The Elmira,\" locatedon the fictional street, \"Elmira,\" resides in the City of Elmira. Theapartment is rented to the gang by a campy, gay, married couple, who alwaysseem to show up unannounced at the most inopportune times. To make mattersworse the apartment sits above a noisy bar. A drag bar called \"Drag-Hag,\"which is the center of confusion to some of the characters.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot1);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot2() {

        String plot2 = ("With Jeremy fresh off the tarmac in Chicago from Los Angeles he and Erikaare ready to work through their issues and resurrect the best sketch showyou\'ve probably never heard of (but should have). #NightStrife, thetelevision series, was birthed from a frustration with the lack of African-Americans in televised comedy and what Jeremy and Erika felt was a lack ofsophistication of material given to black comedians. With #NightStrife, thewebseries, they decided to create a comedy series like nothing else onYouTube.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot2);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot3() {

        String plot3 = ("Four years after the events of Day 8, Jack Bauer remains a federalfugitive. Meanwhile, amid growing concerns over the use of US militarydrones in combat, President James Heller pays a historic visit to London tonegotiate a treaty to continue their basing on British soil. Having heardrumors of an imminent attack against Heller, Bauer resurfaces in the city,where he is apprehended by the CIA and forcibly recruited into joiningtheir investigation, with the promise of amnesty in return for hisco-operation. As forces within the White House conspire against him, Bauerrealizes that the complexity of the plot extends beyond a presidentialassassination, and that the consequences of a successful attack will alterthe course of history. With the help of a disgraced CIA agent and a hackercollective preaching free information, he must confront an unseen enemywhose personal vendetta threatens to push the world to the brink of war.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot3);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot4() {

        String plot4 = ("Jack breaks into the US Embassy to talk to the serviceman who\'s accused offiring his drone on American and British soldiers. Kate follows him. Jacktalks to the man and convinces him that he believes that he didn\'t shootthe soldiers and that someone took control of the drone. He believes Jackand gives Jack his control key. Jack tries to get out but is chased and isforced to hold up in a room and take people hostage. He then contacts Chloewho tries to analyze the key and see how it was hacked. Eventually Marklearns of what happened at the Embassy and informs the President and urgeshim to order an assault to take Jack out. But he wants to talk to him firstand does. Kate after talking to the serviceman believes that Jack is tryingto stop an attack. She listens to Jack\'s conversation with the Presidentand believes him. Mark convinces the President that what Jack is saying isimpossible and to authorize taking Jack out. Audrey is upset with Mark.Kate upon learning of the attack decides to help Jack.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot4);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot5() {

        String plot5 = ("After the op that was supposed to net Margo fails, Heller decides to letJack go ahead with his plan. Jack asks for Kate. He plans to go to a manwho does business with Margo and tricks him into revealing where she is.But he needs to offer up Kate to the man. After killing Naveed, Margo wasabout to dispose of his body when they hear his cellphone and hear a voicemail from his sister. Margo sends Simone to find out if she knows anythingand if so to deal with her. Heller informs the Prime Minister of Jacktrying to find Margo. He is informed of Heller\'s condition and orders hisown people to follow Jack. And the Russians are asking Mark when will theyreceive Jack and Mark finds himself in a spot because he forged Heller\'sname on the extradition document.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot5);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot6() {

        String plot6 = ("After learning the number of the cellphone Margo uses to contact Rask, Jackand Kate learn that the cellphone was with someone who was struck by a busand is now on the way to the hospital. They learn that the person isMargo\'s daughter, Simone. They go to the hospital to talk to her. Margoupon learning what happened to Simone sends someone to find out if sherevealed anything. Jack asks the doctor to wake her up so they can questionher. Kate talks to the girl Simone was chasing and learns that Simone ismarried to her uncle and that she killed her mother. Kate is talking toJack on the cellphone while Margo\'s man listens. He tells her what he heardand Margo decides to send a drone to take out the hospital. Hellerconfronts the PM about sending MI5 after Jack and he tells Heller he knowsabout his condition. Jordan is still trying to recover the files thatproved Kate\'s husband was a traitor. So Navarro is instructed to get rid ofhim so he sends Jordan out on an assignment only someone tries to kill him.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot6);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot7() {

        String plot7 = ("After eluding Margo, Jack and Kate take Simone to the CIA station toquestion her but she\'s unconscious and the doctor says that waking her upis dangerous. Jack is summoned by the President. He informs Jack that hecontacted Margo and agreed to surrender himself and wants Jack to help himget to the location where they agreed. Jack tells Kate what\'s happening andtells her she needs to get what they need from Simone. So Kate \"tells\" thedoctor to wake her up even though it\'s risky. She wakes up but says thatMargo is probably gone and on the move that\'s when she convulses. ThePresident makes the arrangements and says \"goodbye\" to Audrey. The manNavarro sent to take care of Jordan calls and says that his body hasn\'tturned up. Navarro tells him to find him and make sure he\'s done.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot7);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot8() {

        String plot8 = ("After dealing with the ones attacking them, Jack and Kate continue to findthe override device. They find where it was and while there Jack discoversthat Cheng Zi is the one who has it. He then calls the President whoinforms Jack of what happened; that one of their subs attack a Chinesevessel. So it seems like Cheng is trying to get the U.S. and China into aconflict. Jack wonders how the men who attacked him, whom they learn areRussians, found him and he learns it was Boudreau. He goes to confront himwho admits that he tried to turn Jack over to the Russians. They learn thatCheng is working for the Russians who wants the conflict to occur. So hedecides to use Mark to help him find Cheng. In the meantime the Presidnettries to convince the Chinese that the attack was not their doing. But theydon\'t believe him and are making a move.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot8);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot9() {

        String plot9 = ("Napoleon and Cordelia Bopsie have just turned 30, and to the very fewtwitter followers they have, they sent out a not so happy birthday tweetwhich read; 30 sux! They recently were shown on an episode of \"E!\'s TrueHollywood Story\" which reminded the world of the twins fall from fame aftertheir hit Disney show \"The Bopsie\'s\" was canceled at the age of 17. Nowthat E! has caused a media war, Cordelia and Napoleon\'s agent Olive insistson a comeback. There\'s just one problem, neither will do anything unlessthey remain inside their house. The solution to this was supposed to beeasy, a reality show, but the two twins make it nearly impossible for headof the show Panky.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot9);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot10() {

        String plot10 = ("Jenna and her family are the guardians of an ancient quest to rid the worldof evil. 6000 years ago, during a great battle against the last of thisevil, something went wrong and the creature\'s energy was scattered acrossthe planet in 616 pieces. The surviving three warriors vowed to give uptheir mortality and live until these pieces were contained and the creaturefinally defeated. Descended from one of these warriors, and guided by him,Jenna must continue this quest. But time is running out. The followers ofthe creature are also working to retrieve the pieces and when they haveenough it will be able to be reborn... plunging the world into armageddon.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot10);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot11() {

        String plot11 = ("A merry band of misfits form a political underground financialre-distribution engine, in short they become crooks, and through a seriesof bold adventures, swindle the wealthy upper one percent of society out ofa small amount of their holdings to give away to the 99 Percent, those inneed, like the rest of us!.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot11);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot12() {

        String plot12 = ("Imagine looking for love in this new age of computers, Internet dating,social network and texting. Now imagine doing that in a large metropolitancity. Now imagine being from a different city, state or country. And thenimagine your mother hounding you for a grandchild. This is the story of 2aging girls and one gay best friend. Together they live in Los Angeleswhere creepy meets rich and famous. Where looking and finding the perfectguy to marry is becoming extinct. On top of that throw in some strongpersonalities into the mix. What do you get? Foreign Exchange Love.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot12);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot13() {

        String plot13 = ("The crime series, inspired by the routine actions and criminalinvestigations, tells the story of the delegate Jorge Macedo, personaldramas and the way he dismantled a gang responsible for a major assault onan airport. Averse to violence and corporatism, the character puts hisreputation on the line in an attempt to capture Marco Antonio Baroni, asmart and seductive criminal played by Paulo Vilhena.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot13);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot14() {

        String plot14 = ("Just as the hopeless romantic Andrew Lofland begins to grow cynical abouthis work for an Internet dating site-and perhaps love in general-he happensupon dissatisfied customer Zelda Vasco. As it turns out, Andrew andZelda-the titular characters-both work in the same business-park, anddecide to be friends. While out for some innocent drinks, Zelda hears asong that reminds her of a terrible concert she was dragged to. Andrew alsoremembers being dragged to the concert, and monologues about a girl in asilver dress he saw there. He believes that Zelda was that girl and thatfate has brought them together. An unsure Zelda flees the bar, claiming shewasn\'t the girl and that she doesn\'t own a silver dress. When Andrewenlists the help of his programming friends to scour the Internet for proofthat she was the girl, they discover they weren\'t at the same night of theconcert. Zelda storms off and mulls over the silver dress she secretly hasin the closet. She decides to let her defenses down just a little bit, andcalls Andrew. When she confesses that she was the girl in the silver dressand says she wants to give their relationship a second chance, Andrew leansin to kiss her as if to reply wholeheartedly. This episode serves as thepilot of A to Z, and the show will serve to document the course of theirdating relationship, all the way from A to Z.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot14);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot15() {

        String plot15 = ("On the heels of Andrew and Zelda\'s great night together, neither is quitesure where they stand. With Stu\'s encouragement, Andrew goes on a date witha coworker, during and after which Andrew and Zelda both try to play itcool. Meanwhile, Big Bird revokes her \"no office hookups\" policy andencourages all Wallflower workers to test the company\'s new dating app.Recurring guest star BEN FALCONE (Bridesmaids) appears as Howard.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot15);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot16() {

        String plot16 = ("Will Freeman lives a charmed existence. After writing a hit song, he wasgranted a life of free time, free love and freedom from financial woes.He\'s single, unemployed and loving it. So imagine his surprise when Fiona,a needy single mom and her oddly charming 11-year-old son, Marcus, move innext door and disrupt his perfect world. When Marcus begins dropping by hishome unannounced, Will\'s not so sure about being a kid\'s new best friend,until, of course, Will discovers that women find single dads irresistible.That changes everything and a deal is struck: Marcus will pretend to beWill\'s son and, in return, Marcus is allowed to chill at Will\'s house, playping-pong and gorge on steaks, something his very vegan mom would neverallow. Before he realizes it, Will starts to enjoy the visits and evenfinds himself looking out for the kid. In fact, this newfound friendshipmay very well teach him a thing or two that he never imagined possible -about himself and caring for others.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot16);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot17() {

        String plot17 = ("Andy (Al Madrigal) guilts Will (David Walton) into agreeing to babysitMarcus (Benjamin Stockham) so Fiona (Minnie Driver) can go on a jobinterview, but the situation gets complicated when they receive alast-minute invitation to a once-in-a-lifetime charity pool party hosted byrap star Lil Jon (guest star as himself). Meanwhile, Fiona discovers thathonesty isn\'t always the best policy when it comes to landing a job.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot17);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot18() {

        String plot18 = ("With Fiona (Minnie Driver) putting in extra hours at work, Marcus (BenjaminStockham) finally gets his own house key, but he quickly loses his mom\'strust when Will (David Walton) has to rush him to the emergency roomfollowing an untimely incident with a knife. However, Marcus\' misfortunehas a silver lining for Will when he crosses paths with Dr. Samantha Lake(guest star Adrianne Palicki), a beautiful and charming doctor who comes toMarcus\' aid. Will is instantly smitten and stops at nothing in his attemptsto win her over - even if it means bending the truth.");
        double expResult = 1.0;
        double result = instance.classify_plot(plot18);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot19() {

        String plot19 = ("Yona is a princess who lives happily in the palace with her father andfriends, oblivious to the misery of the kingdom. But the day of hersixteenth birthday her life changes: the emperor is killed. Yona has to runaway to survive. She\'ll be helped by her friend and bodyguard, General Hak.Together they embark on a journey to find and ask for help from the fourdragons of the legend. During the adventure, Yona observes the kingdom andopens her eyes, determined to become a princess who helps her people.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot19);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot20() {

        String plot20 = ("In 1972, an ancient alien hypergate was discovered on the surface of themoon. Using this technology, humanity began migrating to Mars and settlingthere. After settlers discovered additional advanced technology, the VersEmpire was founded, which claimed Mars and its secrets for themselves.Later, the Vers Empire declared war on Earth, and in 1999, a battle on theMoon\'s surface caused the hypergate to explode, shattering the Moon andscattering remnants into a debris belt around the planet. Cut off fromMars, the remnants of the Vers Empire established several massive orbitalspace stations within the debris belt and a ceasefire was established. 15years later, in 2014, an attack on the Vers princess during a peace missioncauses the Empire to launch a new attack on Earth, this time determined toconquer it once and for all.");
        double expResult = 2.0;
        double result = instance.classify_plot(plot20);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot21() {

        String plot21 = ("Gruesome animal killings have left a remote Southern town on edge. Thelocal animal control team thinks a large predator is responsible, but whena hiker goes missing many of the townsfolk believe a legendary swampcreature might be to blame.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot21);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot22() {

        String plot22 = ("This is a pilot for a television series about a story of two unlikelypeople who find each other for one common goal, LOVE. When Michael andFaith met who knew it was destined to be that they would risk taking achance on love, laughter, and trust in this romantic comedy. Although theycome from two totally different backgrounds, and there\'s a bit of an agedifference they find out that true love is boundless.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot22);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot23() {

        String plot23 = ("News/information/talk show dedicated to covering all aspects of the horrorgenre. Hosts Staci Layne Wilson and \"Gore Whore\" Vanessa Gomez will guideviewers on a weekly journey of keeping current in horror via news updates,interviews with genre and mainstream stars and filmmakers, exclusive clips,trailer premieres as well as exclusive coverage from set visits for horrorfeature films and TV shows in production.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot23);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot24() {

        String plot24 = ("Follow Isla, Tina, Ester and Renee on a Sunday brunch as they recap thepast 24 hours of their lives. Season one finds Isla on the brink ofbecoming celibate, which drastically affects her relationship with herboyfriend, King. Tina deals with an unemployed boyfriend that hasoverstayed his welcome. Ester works to maintain the facade of being in ahappy marriage; and Renee finally meets someone she\'s genuinely interestedin, only for him to share that he wants to have children. Follow thesewomen as they mold, create, and re-define their moral compass.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot24);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot25() {

        String plot25 = ("A year after the suspicious death of one of their friends, five teenagersare tormented by an unknown individual who appears to know the truth andseems intent on breaking them down mentally, one by one. \'I Know Who YouAre\' is a story of lies and deception, where anybody is a suspect andnobody is safe.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot25);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot26() {

        String plot26 = ("The idyllic Milton\'s Island exists as a paradise on earth, with pristinebeaches, lush woodlands, and charming old world buildings. As the home ofParadise University, complete with friendly residents and a small townvibe, the island is the perfect setting for higher learning. However, darksecrets lurk in the shadows. A group of ghost-hunters unwittingly getinvolved in a series of strange murders, and malevolent forces threaten totear new relationships apart.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot26);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot27() {

        String plot27 = ("Some believe there are things that move among us unseen to the naked eye.Caught between a world they once lived in and the hereafter, some believethere are darker forces that are sticking around to settle unfinishedbusiness... Then there are others who believe that there are no such thingsand that there will always be an explanation for supernatural phenomena.PARANORMAL BELIEVER is the first groundbreaking series to take both thebeliever and a non-believer on an investigation of the paranormal toprovide the skeptic with enough evidence to possibly change their mind.Join PARANORMAL BELIEVER as we travel to some of the most bone chillingparanormal hot-spots in existence. Will the skeptic become a believer? Tunein to the most original paranormal series produced. A series some mediaoutlets are already calling, \"the scariest paranormal show ever!\"...PARANORMAL BELIEVER.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot27);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot28() {

        String plot28 = ("This is a touching love story based on the novel by Mir Jam. The successfuland young lawyer, Radmilo, is in love with a beautiful girl from Belgrade -Ljiljana, who he hasn\'t seen for years. She is in love with another manbut, as he reveals that he is not willing to marry her, she acceptsRadmilo\'s marriage proposal just to spite him. On their first wedding nightshe admits that she loves another and tries to leave the house but Radmiloasks her to give him three months so he could think of a good excuse forthem to separate, since he lives in a small place where everyone knows (andtalks about) everything. As it happens, during those three months emotionsbloomed and what started with a fight continued with affection.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot28);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot29() {

        String plot29 = ("Roman invites Emery inside the sector to celebrate Dinaskyu, an Atrianholiday that celebrates the family. Emery asks Sophia for tips on how toimpress her mother. Vega tells Drake that with Zoe missing, they\'ve tappedhim to be their new undercover operative, which means he\'ll be leaving townand getting his markings removed. When Roman goes to Vega and asks her toreconsider sending Drake away, she offers him a way out. Meanwhile, Evaapproaches Julia with an offer. When Julia refuses, Eva takes her missionto a dangerous place. Finally, Grayson confronts Emery about her feelingsfor Roman. Susan Walters Ashby, Merle Dandridge and Stephanie Jacobsonguest star.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot29);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot30() {

        String plot30 = ("When Gloria tells the Atrian Seven they are allowed to spend some timeoutside their sector, Roman sees it as an opportunity to furtherinvestigate his father\'s mysterious past and makes a stunning discovery.Emery and Grayson go out on a date, but their night is ruined after Ericcalls Grayson for help and ends up putting everyone in danger. Drakemistakes Taylor for an undercover Trag, and Lukas makes his move on Sophia.Meanwhile, Teri tries to take over Drake\'s mission. Victoria Platt andJesse Luken guest star.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot30);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot31() {

        String plot31 = ("After Roman is badly hurt, Emery turns to an unexpected ally for help.Meanwhile, Grayson, Drake, Sophia and Lukas race to find the stolen Suvekbefore the Trags can activate it. However, Vega is a step ahead of them andsets off the Suvek in the middle of a Marti Gras parade. Teri is shockedwhen she overhears Vega ordering the death of her friends. Gloria discoversTaylor\'s secret and shares one of her own.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot31);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot32() {

        String plot32 = ("When Emery Whitehill was 6-years old, an alien spacecraft filled withhumanoid aliens from the planet Atria crash-landed in her Louisiana smalltown and she met Roman, a 6-year old Atrian boy, who sought refuge with herbefore being taken away by the authorities. Ten years later, the two arereunited as the first group of seven Atrian teens is about to enroll inhigh school in a widely scrutinized social experiment to see if humans andAtrians can live in peace. Both Emery and Roman are surprised at thesmall-mindedness of their respective communities. Roman\'s sister, Sophia,is excited to make new friends, but their fellow Atrians, Teri and Drake,openly distrust all humans. The human students are equally wary of thealiens, especially the school\'s cynical queen bee Taylor. Kind-heartedGrayson is drawn to Emery but has a secret that could threaten their newfriendship. Only two of Emery\'s friends - Julia and Lukas, seem able toaccept the Atrians. Emery and Roman find themselves drawn together againbut outside forces work hard to keep them apart. When Julia is sufferingfrom an auto-immune illness, Emery seeks out Roman\'s help to find a curefor her.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot32);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot33() {

        String plot33 = ("Roman argues with Emery about whether he can trust his uncle Castor.However, when Roman asks his uncle about the day their spaceship crashed,Castor\'s reaction is far from what he expected. Meanwhile, Grayson tries toremember what happened the night he blacked out, and Taylor throws a\"meteor shower\" party to spend more time with Drake. Still unable to denyher feelings for Roman, Teri makes a decision that puts her in gravedanger. Sophia finally makes her move on Taylor but she still has interestsin Drake.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot33);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot34() {

        String plot34 = ("When Emery is confronted by a tabloid photographer with video of hertalking about cyper, she enlists Julia\'s help to find a replacement storyfor him. Meanwhile, Drake tells Roman that Grayson\'s parents are theleaders of the Red Hawks. When Grayson\'s parents throw a big charity ballat their house, Drake makes plans to go, at Vega\'s request, to undertake animportant mission. Roman goes to the party to make sure Drake stays out oftrouble, but gets caught in the middle of a kidnapping scheme.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot34);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot35() {

        String plot35 = ("After Roman and Drake discover the Trags are building a bomb known as aSuvec, they realize they need help and turn to an unexpected source -Grayson. Emery enlists Sophia and Lukas to help them smuggle the Suvek outof the sector, which ultimately puts all of them in danger. Meanwhile, Tericontinues her mission.");
        double expResult = 3.0;
        double result = instance.classify_plot(plot35);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot36() {

        String plot36 = ("Sara, must become \"super mom\" in this horror style episode to save herdaughter, Lexi, from being possessed by the supernatural poltergeistphenomena that the AV equipment has been triggered in their otherwisepeaceful, loving home environment.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot36);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot37() {

        String plot37 = ("Varney the Vampire follows the Bannerworths, a formerly wealthy familydriven to ruin by their recently deceased father. When Sir Francis Varneyenters their lives, the family (Mrs. Bannerworth and her adult childrenHenry and Flora) fight as they try to prove to their peers and tothemselves that Varney is the vampiric ancestor of the Bannerworths preyingon their vulnerability.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot37);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot38() {

        String plot38 = ("Vera Bes is a girl with a special power: using the mystery of \"luciddreams\" learned from her grandmother, she is capable to get into people\'sdreams. That\'s why, although everybody knows her as a talented tattooartist, she is also a \"dream consultant\": anybody affected by a recurringnightmare can come by her studio for a free visit. After investigating bothin her clients\' world of dreams and in reality, she climbs down theclients\' unconscious to set them free from that particular nightmare. ButVera has a further motivation: finding and killing the evil presence whomurdered her grandmother.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot38);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot39() {

        String plot39 = ("20 years earlier, Norman (30\'s), has been placed in a straight jacket,inside a mental institution. He has spent years writing numbers on hiscell, often in blood. A recurring number is identified as 11-12-13. Inpresent day, a young group of college students set off for a fun filledsummer vacation at a remote cabin, which Ethan has just bought. As thegroup begins to enjoy themselves, their personalities emerge. Emma (20\'s),a hitchhiker, who is just passing by, tells them the horrific story ofNorman and the cabin.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot39);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot40() {

        String plot40 = ("Elliot Brindle is a bright, meek salesman, drowning in debt - and desperateas he\'s about to marry the love of his life. Upon receiving a phone callinforming him that he\'s on a hidden camera game show where he must execute13 tasks to receive a sum total cash prize of $6.2M, Elliot dismissivelyfollows through with his first two instructions: swat the fly that iscurrently bothering him, then eat the fly. With thousands of dollarssuddenly appearing in his bank account, Elliot remains skeptical, thoughcomforted by the knowledge that he can stop playing at anytime if only tolose every penny that he\'s won. Trapped into the horrors manipulated byunseen spectators, Elliot\'s need to complete the game escalates as thetasks grow more extreme, to a devastating point of no return.");
        double expResult = 4.0;
        double result = instance.classify_plot(plot40);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot41() {
        String plot41 = ("Fed up with answering to higher-ups, Nick, Dale and Kurt decide to become their own bosses by launching their own business. But a slick investor soon pulls the rug out from under them. Outplayed and desperate, and with no legal recourse, the three would-be entrepreneurs hatch a misguided plan to kidnap the investor's adult son and ransom him to regain control of their company");
        double expResult = 0.0;
        double result = instance.classify_plot(plot41);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot42() {
        String plot42 = ("Twelve years in the less than nuclear life of a nuclear Texas family - father Mason, mother Olivia, oldest offspring Samantha, and youngest offspring Mason Jr. - is presented, focusing on the younger Mason's entire public school years, he sometimes referred to as MJ when in the presence of his father. This phase of their story begins in 2002 when Olivia and Mason, who originally married because she was pregnant, are now divorced, the marriage which was destined to dissolve due to these circumstances. Olivia has custody of the two children, and when he is around, Mason has weekend visitation rights, which has not happened in the last year or so as he stated he, an aspiring musician and somewhat irresponsible young adult, was \"away somewhere in Alaska\" trying to find himself. Olivia wants to eke out a better life for herself and the kids in a way that will also satisfy her own emotional needs. The two parents also try to move on with their sexual and relationship lives in the high probability that they will never reconcile, much against their children's own wants. MJ's growing up is affected by these circumstances and whatever the situation at the time outwardly orchestrated by Olivia (but often manipulated by others), and by his relationship with his family members - who evolve as they each grow up chronologically and emotionally - and others in his ever changing life.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot42);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot43() {
        String plot43 = ("When their father passes away, four grown siblings, bruised and banged up by their respective adult lives, are forced to return to their childhood home and live under the same roof together for a week, along with their over-sharing mother and an assortment of spouses, exes and might-have-beens. Confronting their history and the frayed states of their relationships among the people who know and love them best, they ultimately reconnect in hysterical and emotionally affecting ways amid the chaos, humor, heartache and redemption that only families can provide-driving us insane even as they remind us of our truest, and often best, selves.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot43);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testClassify_plot44() {
        String plot44 = ("Anastasia \"Ana\" Steele is a 21-year-old college senior attending Washington State University in Pullman, Washington with her best friend Katharine \"Kate\" Kavanagh, who writes for their student newspaper. Due to an illness, Kate persuades Ana to take her place and interview 27-year-old Christian Grey, an incredibly successful and wealthy young entrepreneur in Seattle. Ana is instantly attracted to Christian, but also finds him intimidating. As a result, she stumbles through the interview asking questions about his personal life and relationships and leaves Christian's office believing that it went badly. Ana tries to console herself thinking the two of them will probably never meet again. However she is surprised when Christian appears at Clayton's, the largest independent hardware store in the Portland area, where she works. While he purchases various items including cable ties, masking tape and rope, Ana informs Christian that Kate would like some photographs to go along with her article about him. Christian leaves Ana with his phone number. Later that day, Kate urges Ana to call Christian and arrange a photo shoot with their photographer friend José Rodriguez.The next day José, Kate, and Ana arrive for the photo shoot at the Heathman where Christian is staying and Christian asks Ana out for coffee. The two talk over coffee and Christian asks Ana if she's dating anyone, specifically José. When Ana replies that she isn't dating anyone, Christian begins to ask her about her family. During the conversation Ana learns that Christian is also single, but is not \"a hearts and flowers kind of guy\". This \"warning\" intrigues Ana, especially after he pulls her out of the path of an oncoming cyclist. However, Ana believes that she is not attractive enough for Christian, much to the chagrin of Kate.After finishing her exams, Ana receives a package from Christian containing first edition copies of Tess of the d'Urbervilles, which stuns her. Later that night, Ana goes out drinking with her friends and ends up drunk dialing Christian, who informs her that he will be coming to pick her up because of her inebriated state. Ana goes outside to get some fresh air, and José attempts to kiss her but is stopped by Christian's arrival. Ana leaves with Christian, but not before she discovers that Kate has been flirting with Christian's brother, Elliot. Later, Ana wakes to find herself in Christian's hotel room, where he scolds her for not taking proper care of herself. Christian then reveals that he would like to have sex with her. He initially says that Ana will first have to fill out paperwork, but later goes back on this statement after making out with her in the elevator.Ana goes on a date with Christian where he takes her in his helicopter to his apartment. Once there, Christian insists that she sign a non-disclosure agreement forbidding her to discuss anything that they do together, which Ana agrees to sign. He also mentions other paperwork, but first takes her to his playroom full of BDSM toys and gear. There Christian informs her that the second contract will be one of dominance and submission and that there will be no romantic relationship, only a sexual one. The contract even forbids Ana from touching Christian or making eye contact with him. At this point, Christian realizes that Ana is a virgin and agrees to take her virginity without making her sign the contract. The two then have sex.The following morning, Ana and Christian once again have sex. His mother then arrives moments after their sexual encounter, and is surprised by the meeting, having previously thought Christian was homosexual because he was never seen with a woman. Christian later takes Ana out to eat, and he reveals to her that he lost his virginity at fifteen to one of his mother's friends and that his previous dominant/submissive relationships (Christian reveals that in his first dominant/submissive relationship he was the submissive) failed due to incompatibility. They plan to meet up again and Christian takes Ana home, where she discovers several job offers and admits to Kate that she and Christian had sex.Over the next few days, Ana receives several packages from Christian. These include a laptop to enable her to perform research on the BDSM lifestyle in consideration of the contract as well as for the two of them to communicate, since she has never previously owned a computer, and a more detailed version of the dominant/submissive contract. She and Christian email each other, with Ana teasing him and refusing to honor parts of the contract, such as only eating foods from a specific list. Ana later meets up with Christian to discuss the contract, only to grow overwhelmed by the potential BDSM arrangement and the potential of having a sexual relationship with Christian that is not romantic in nature. Because of these feelings, Ana runs away from Christian and does not see him again until her college graduation, where he is a guest speaker. During this time, Ana agrees to sign the dominant/submissive contract.Ana and Christian once again meet up to further discuss the contract, and they go over Ana's hard and soft limits. Ana is spanked for the first time by Christian; the experience leaves her both enticed and slightly confused. This confusion is exacerbated by Christian's lavish gifts, and the fact that he brings her to meet his family. The two continue with the arrangement without Ana having yet signed the contract. After successfully landing a job with Seattle Independent Publishing, Ana further bristles under the restrictions of the non-disclosure agreement and the complex relationship with Christian.The tension between Ana and Christian eventually comes to a head after Ana asks Christian to punish her in order to show her how extreme a BDSM relationship with him could be. Christian fulfills Ana's request, beating her with a belt, only for Ana to realize that the two of them are incompatible. Devastated, Ana leaves Christian and returns to the apartment she shares with Kate");
        double expResult = 0.0;
        double result = instance.classify_plot(plot44);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testClassify_plot45() {
        String plot45 = ("Matty and Michael are two best friends and virgins who vow to each other they will have sex before their senior prom. However, Matty tells Michael that he is gay, changing their quest.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot45);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testClassify_plot46() {
        String plot46 = ("Nick Hendricks, Dale Arbus, and Kurt Buckman decide to start their own business after tiring of working for ungrateful bosses. Their idea is a car-wash-inspired shower head called the \"Shower Buddy\". They have trouble finding investors until they are approached by Burt Hanson and his son Rex. Burt admires their commitment to manufacturing the product themselves, while Rex prefers to outsource to China, and agrees to invest if they can make 100,000 units. Taking out a business loan, the three rent a warehouse, hire employees, and manage to produce their output, but Burt backs out of their deal at the last minute, claiming that he never signed an agreement, and he plans on taking their inventory in foreclosure and selling them (renamed the \"Shower Pal\") himself, while leaving the three in $500,000 debt with their outstanding loan.Seeking financial advice, Nick, Dale, and Kurt visit Nick's old boss Dave Harken in prison, who says the three have no feasible legal options to recover their losses. The three then resolve to kidnap Rex and hold him for ransom. They seek the help of \"Motherfucker\" Jones, who says the best way to pull off kidnapping someone who knows them is to keep him unconscious for the duration of the kidnapping. The three create a ransom note of $500,000 and go to the office of Dale's old boss Dr. Julia Harris to steal a tank of nitrous oxide. While there, Kurt and Dale are almost caught by Julia's sex addiction group meeting; after the group leaves, Nick has sex with Julia, providing the distraction that allows Dale and Kurt to escape the building. The trio goes to Rex's house, but while they hide in the closet, they accidentally turn on the tank and pass out. When they wake up in the morning, they find Rex gone.When they arrive back at the warehouse, they find Rex tied up in the trunk of their car. Rex gets out and reveals he found them hiding in his closet, but decides to stage his own kidnapping with them due to his strained relationship with his dad. Rex sent the ransom note to his dad and increased the ransom to $5,000,000. The three are uncertain of Rex's plan, but Rex threatens to go to the police if they back out. They call Burt to inform him of Rex's kidnapping, after which Rex is confident that Burt will not involve the cops; however, the police, led by Detective Hatcher, subsequently arrive at their warehouse to question Nick, Dale, and Kurt due to their involvement with Burt. When the police leave, Rex breaks down knowing Burt cares more about his money than his son. Now sympathetic to Rex, the trio agrees to work with him in the fake kidnapping, and all four devise a plan to outsmart the police and take the ransom money, utilizing untraceable phones, a basement garage to block out any tracking signal, and Kurt disguising himself as Burt.While the plan is in motion, Nick, Dale, and Kurt find that Kurt left Burt his own phone instead of the untraceable one. They nevertheless call Burt on Kurt's phone to give him the instructions. Before they leave, Julia arrives at their hotel room and demands to sleep with Dale or else she'll report them for breaking into her office. Unfortunately, Dale's wife Stacy then arrives via \"Find My Phone\" app and, believing Dale is cheating on her with Julia, storms off. Dale angrily locks Julia in the bathroom so the three can leave. In the basement garage, Nick, Dale, and Kurt, wearing masks, tell Burt to give back the cell phone. Burt is then shot dead by Rex, who reveals that, after seeing that his father did not care about him, he decided to kill Burt and frame Nick, Dale, and Kurt so Rex can inherit the family business. Rex forces Kurt to switch pants as Rex's pants have Burt's blood on them.As the trio are about to be cornered by the police, Jones arrives, as he anticipated that the three would be betrayed and killed and was seeking to claim the ransom money for himself. He attempts to help them get back to the warehouse where Rex is supposed to be tied up, with the police chasing them, before Rex does so they can prove their innocence. When they get back to the warehouse, Jones escapes with the money and the police arrive to find Rex tied up. Before the police arrest Nick, Dale, and Kurt, Kurt's phone rings in Rex's pocket, and the police recognize the ringtone as the same phone that was left to Burt by the kidnappers. Rex tries to claim the phone is his, but when Hatcher asks why Rex didn't bother to call the police if he had a phone, Rex takes Hatcher hostage. Dale attempts to attack Rex, but Rex shoots him, which distracts Rex long enough for Hatcher to subdue him.A few days later, Dale wakes up to find out that the three did get in trouble, but because Dale helped save Hatcher's life, the police dropped the charges. He also finds out that Julia helped make amends with Stacy. In the aftermath, their business goes into foreclosure, but is subsequently purchased by Harken in prison, who allows the three of them to stay employed. Jones, meanwhile, uses the ransom money to invest in Pinkberry.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot46);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testClassify_plot47() {
        String plot47 = ("Rich is a sex addict who ruins every relationship through infidelity. He wishes that his penis would leave him alone. He wakes up one day to find his penis has taken on human form.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot47);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testClassify_plot48() {
        String plot48 = ("Carly (Cameron Diaz) has just started a relationship with Mark (Nikolaj Coster-Waldau), a man she hooked up with eight weeks prior. She is upset when Mark suddenly tells her he has to go out of town, but decides to go over to his house per advice from her father Frank (Don Johnson). Intending to seduce him while wearing a sexy outfit, she is horrified to meet Kate (Leslie Mann), who introduces herself as Mark's wife. Despite the problems, the two women end up bonding and forming an unlikely friendship. When Kate discovers that Mark is still seeing someone on the side, she initially believes that it is Carly but she and Carly eventually discover that Mark is seeing a third woman, a beautiful young woman named Amber (Kate Upton).Carly and Kate travel to the beach, where Kate has a run in with Amber and the two women inform her that Mark has been cheating on all of them. They decide to take revenge by doing things such as spiking his smoothies with estrogen and giving him breasts, as well as putting hair removal cream in his shampoo. Through their pranks, they discover that Mark has been embezzling from various companies at his workplace and Carly begins to connect romantically with Kate's brother Phil (Taylor Kinney). In addition, Amber confides to Carly that she is seeing someone else as well. However, their camaraderie begins to shatter when Kate finds herself falling for Mark again after an investor's dinner and is upset when Carly exposes his fraud and offers to prove he didn't change and ask Mark if he wants to hang out.Later, Mark goes to the Bahamas on a supposed business trip, Kate decides to follow him there and blow up his cover. She finds out Carly and Amber at the airport, who explain what Mark has been up to, using Kate as the owner of the companies Mark defrauded, which would cause Kate to go to prison if the fraud is discovered. She discovers that Mark has yet another woman and that he had been seeing her. This, and the possibility of facing prison in Mark's place, urges Kate to take actions with help from Carly's legal expertise.When Mark returns from vacation, he goes to visit Carly at her office. He is then locked in the conference room by Carly's assistant Lydia (Nicki Minaj), and is shocked to find all three women together who then confront him with all of his infidelities and embezzlement they have discovered. With Carly as her attorney, Kate demands a divorce. Kate reveals that she has returned the embezzled money to the companies, which helps the divorcing couple avoid prison but leaves Mark bankrupt. On top of this, Mark's business partner Nick arrives and fires Mark upon the discovery of the crime and in addition offers Kate the chance to take over her former husband's job in appreciation of her honesty. Then as he begins to leave Mark breaks his nose running into a door, he ruined his suit falling on the walls of a glass room, his Aston Martin gets towed and, Frank hits Mark in the face in retaliation upon leaving. The film ends with Carly eventually marrying Phil and the couple expecting a child, Amber marrying Frank and the couple following the summer season around the globe (Carly refuses to call Amber \"Mom\"), and Kate working as a CEO with Mark's former business partners and the company making a profit under her leadership.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot48);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testClassify_plot49() {
        String plot49 = ("Jay (Jason Segel) and Annie (Cameron Diaz) are a couple who have sex at every chance they can get. After having two children, they have fewer opportunities to have sex. While the children are away one night, they try to reignite their sex life. After Jay struggles to get an erection, Annie suggests making a sex tape. They film themselves having sex in every position listed in The Joy of Sex. After Annie asks Jay to delete the tape, he ends up instead inadvertently synchronizing the video to several iPads the couple had given away over time. After failing to get it out of the cloud, they set out to get back all of the gifted iPads, leading to a series of awkward encounters and close calls.After collecting the iPads and deleting the videos, their neighbor's son threatens to upload their sex tape to YouPorn unless they give him $25,000. After failing to get the money, they break into the YouPorn headquarters and begin to destroy their servers. Their plan is quickly thwarted when an alarm sounds. The owner (Jack Black) and his cronies confront them and threaten to call the police, but agree not to do so in exchange for $15,000 to cover the damage. He also removes their video and explains that all they had to do to have a video removed was send him an e-mail request for such removal. After they have deleted all but one copy of the video, Jay and Annie decide to watch the video once themselves. Afterwards, they take the USB flash drive containing the video and go outside to smash it with a hammer, blend it, burn it with fire, and bury the pieces.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot49);
        assertEquals(expResult, result, 0.0);
    }
    
    /*@Test
    public void testClassify_plot50() {
        String plot50 = ("");
        double expResult = 0.0;
        double result = instance.classify_plot(plot50);
        assertEquals(expResult, result, 0.0);
    }*/
    
}