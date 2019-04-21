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
public class PlayBlackjackTest {

   public PlayBlackjackTest() {
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
    * Test of good bet amount (less than the balance).
    */
   @Test
   public void testBetMoneyGood() {
      System.out.println("GoodBet");
      double bet = 1;
      boolean expectedResult = true;
      Player p2 = new BlackjackPlayer("player", 1000);
      boolean result = ((BlackjackPlayer) (p2)).getMoney(bet) < (p2.getBalance());
      assertEquals(expectedResult, result);
   }

   /**
    * Test of bad bet amount (greater than the balance).
    */
   @Test
   public void testBetMoneyBad() {
      System.out.println("Bad Bet");
      double bet = 100000;
      boolean expectedResult = false;
      Player p2 = new BlackjackPlayer("player", 1000);
      boolean result = ((BlackjackPlayer) (p2)).getMoney(bet) > (p2.getBalance());
      assertEquals(expectedResult, result);
   }

   /**
    * Test of bet at the boundary.
    */
   @Test
   public void testBetBoundry() {
      System.out.println("Bet Boundary");
      double bet = 1000;
      boolean expectedResult = false;
      Player p2 = new BlackjackPlayer("player", 1000);
      boolean result = ((BlackjackPlayer) (p2)).getMoney(bet) == (p2.getBalance());
      assertEquals(expectedResult, result);
   }

       /**
     * Test of declareWinner method for draw good, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerDrawGood() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 21;
        int sumPlayer = 21;

        int judge = sumPlayer - sumDealer;

        if (judge == 0) {
            System.out.println("Draw");
        }

    }

    /**
     * Test of declareWinner method for draw bad, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerDrawBad() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 25;
        int sumPlayer = 20;

        int judge = sumPlayer - sumDealer;

        if (judge == 0) {
            System.out.println("Not a draw");
        }

    }

    /**
     * Test of declareWinner method for draw boundary, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerDrawBoundary() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 22;
        int sumPlayer = 22;

        int judge = sumPlayer - sumDealer;

        if (judge == 0) {
            System.out.println("Draw");
        }

    }

    /**
     * Test of declareWinner method for player good, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerPlayerGood() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 17;
        int sumPlayer = 21;

        int judge = sumPlayer - sumDealer;

        if (judge == 0) {
            System.out.println("Player wins");
        }
    }
        @Test
    public void testDeclareWinnerPlayerGoodDealerBust() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 25;
        int sumPlayer = 21;

        int judge = sumPlayer - sumDealer;

        if (judge == 0) {
            System.out.println("Player wins");
        }
    }
  @Test
    public void testDeclareWinnerPlayerGoodPlayerBust() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 20;
        int sumPlayer = 25;

        int judge = sumPlayer - sumDealer;

        if (judge == 0) {
            System.out.println("Dealer wins");
        }
    }
    /**
     * Test of declareWinner method for player boundary, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerPlayerBoundary() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 20;
        int sumPlayer = 21;

        int judge = sumPlayer - sumDealer;

        if (judge < 0) {
            System.out.println("Player wins");
        }

    }

    /**
     * Test of declareWinner method for player bad, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerPlayerBad() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 20;
        int sumPlayer = 19;

        int judge = sumPlayer - sumDealer;

        if (judge < 0) {
            System.out.println("Player loses");
        }

    }

    /**
     * Test of declareWinner method for dealer good, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerDealerGood() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 20;
        int sumPlayer = 18;

        int judge = sumPlayer - sumDealer;

        if (judge > 0) {
            System.out.println("Dealer wins");
        }

    }

    /**
     * Test of declareWinner method for dealer boundary, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerDealerBoundary() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 20;
        int sumPlayer = 19;

        int judge = sumPlayer - sumDealer;

        if (judge > 0) {
            System.out.println("Dealer wins");
        }

    }

    /**
     * Test of declareWinner method for dealer bad, of class PlayBlackjack.
     */
    @Test
    public void testDeclareWinnerDealerBad() {
        System.out.println("declareWinner");
        int situation = 0;
        PlayBlackjack instance = new PlayBlackjack();
        instance.declareWinner(situation);
        int sumDealer = 19;
        int sumPlayer = 20;

        int judge = sumPlayer - sumDealer;

        if (judge > 0) {
            System.out.println("Dealer loses");
        }

    }
}