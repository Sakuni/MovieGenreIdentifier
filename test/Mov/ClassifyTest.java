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
    public void testClassify_plot1() {
        String plot = ("Fed up with answering to higher-ups, Nick, Dale and Kurt decide to become their own bosses by launching their own business. But a slick investor soon pulls the rug out from under them. Outplayed and desperate, and with no legal recourse, the three would-be entrepreneurs hatch a misguided plan to kidnap the investor's adult son and ransom him to regain control of their company");
        double expResult = 0.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testClassify_plot2() {
        String plot = ("Twelve years in the less than nuclear life of a nuclear Texas family - father Mason, mother Olivia, oldest offspring Samantha, and youngest offspring Mason Jr. - is presented, focusing on the younger Mason's entire public school years, he sometimes referred to as MJ when in the presence of his father. This phase of their story begins in 2002 when Olivia and Mason, who originally married because she was pregnant, are now divorced, the marriage which was destined to dissolve due to these circumstances. Olivia has custody of the two children, and when he is around, Mason has weekend visitation rights, which has not happened in the last year or so as he stated he, an aspiring musician and somewhat irresponsible young adult, was \"away somewhere in Alaska\" trying to find himself. Olivia wants to eke out a better life for herself and the kids in a way that will also satisfy her own emotional needs. The two parents also try to move on with their sexual and relationship lives in the high probability that they will never reconcile, much against their children's own wants. MJ's growing up is affected by these circumstances and whatever the situation at the time outwardly orchestrated by Olivia (but often manipulated by others), and by his relationship with his family members - who evolve as they each grow up chronologically and emotionally - and others in his ever changing life.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testClassify_plot3() {
        String plot = ("When their father passes away, four grown siblings, bruised and banged up by their respective adult lives, are forced to return to their childhood home and live under the same roof together for a week, along with their over-sharing mother and an assortment of spouses, exes and might-have-beens. Confronting their history and the frayed states of their relationships among the people who know and love them best, they ultimately reconnect in hysterical and emotionally affecting ways amid the chaos, humor, heartache and redemption that only families can provide-driving us insane even as they remind us of our truest, and often best, selves.");
        double expResult = 0.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testClassify_plot4() {
        String plot = ("");
        double expResult = 3.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testClassify_plot5() {
        String plot = ("");
        double expResult = 3.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testClassify_plot6() {
        String plot = ("");
        double expResult = 3.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testClassify_plot7() {
        String plot = ("");
        double expResult = 3.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testClassify_plot8() {
        String plot = ("");
        double expResult = 3.0;
        double result = instance.classify_plot(plot);
        assertEquals(expResult, result, 0.0);

    }
}
