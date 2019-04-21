/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playblackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shann
 */
public class BlackjackPlayerTest {
   
   public BlackjackPlayerTest() {
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
    * Test of play method, of class BlackjackPlayer.
//    */
//   @Test
//   public void testPlay() {
//      System.out.println("play");
//      BlackjackPlayer instance = null;
//      instance.play();
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }

   /**
    * Test of betMoney method, of class BlackjackPlayer.
    */
   @Test
   public void testBetMoneyGood() {
      System.out.println("GoodBet");
      double bet = 1;
      boolean expectedResult = true;
      Player p2 = new BlackjackPlayer("player", 1000);
      boolean result=((BlackjackPlayer)(p2)).getMoney(bet) < (p2.getBalance());
      assertEquals(expectedResult, result);
   }
}

   /**
    * Test of getName method, of class BlackjackPlayer.
    */
//   @Test
//   public void testGetName() {
//      System.out.println("getName");
//      BlackjackPlayer instance = null;
//      String expResult = "";
//      String result = instance.getName();
//      assertEquals(expResult, result);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
//
//   /**
//    * Test of setHand method, of class BlackjackPlayer.
//    */
//   @Test
//   public void testSetHand() {
//      System.out.println("setHand");
//      int[][] cards = null;
//      BlackjackPlayer instance = null;
//      instance.setHand(cards);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
//
//   /**
//    * Test of addToBalanceWin method, of class BlackjackPlayer.
//    */
//   @Test
//   public void testAddToBalanceWin() {
//      System.out.println("addToBalanceWin");
//      double bet = 0.0;
//      BlackjackPlayer instance = null;
//      double expResult = 0.0;
//      double result = instance.addToBalanceWin(bet);
//      assertEquals(expResult, result, 0.0);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
//
//   /**
//    * Test of addToBalancePlayerGetsBlackJack method, of class BlackjackPlayer.
//    */
//   @Test
//   public void testAddToBalancePlayerGetsBlackJack() {
//      System.out.println("addToBalancePlayerGetsBlackJack");
//      double bet = 0.0;
//      BlackjackPlayer instance = null;
//      double expResult = 0.0;
//      double result = instance.addToBalancePlayerGetsBlackJack(bet);
//      assertEquals(expResult, result, 0.0);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
//
//   /**
//    * Test of gameDraw method, of class BlackjackPlayer.
//    */
//   @Test
//   public void testGameDraw() {
//      System.out.println("gameDraw");
//      double bet = 0.0;
//      BlackjackPlayer instance = null;
//      double expResult = 0.0;
//      double result = instance.gameDraw(bet);
//      assertEquals(expResult, result, 0.0);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }
//   
//}
