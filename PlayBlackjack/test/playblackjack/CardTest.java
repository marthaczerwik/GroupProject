/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playblackjack;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marth
 */
public class CardTest {
    
    public CardTest() {
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
     * Test of distributeCards method, of class Card.
     */
    @Test
    public void testDistributeCards() {
        System.out.println("distributeCards");
        String player = "";
        Card instance = new Card();
        int[][] expResult = null;
        int[][] result = instance.distributeCards(player);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collectCards method, of class Card.
     */
    @Test
    public void testCollectCards() {
        System.out.println("collectCards");
        Card instance = new Card();
        instance.collectCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnHands method, of class Card.
     */
    @Test
    public void testReturnHands() {
        System.out.println("returnHands");
        int player = 0;
        Card instance = new Card();
        ArrayList expResult = null;
        ArrayList result = instance.returnHands(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnCurrentHandValue method, of class Card.
     */
    @Test
    public void testReturnCurrentHandValue() {
        System.out.println("returnCurrentHandValue");
        int player = 0;
        Card instance = new Card();
        int expResult = 0;
        int result = instance.returnCurrentHandValue(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
