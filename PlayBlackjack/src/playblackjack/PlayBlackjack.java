package playblackjack;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shin
 */
public class PlayBlackjack {

    private final double DEFAULT_AMOUNT = 1000;
    private final String[] RESULT = {"Draw", "Winner Dealer", "Winner Player"};
    private final int ROUNDS = 5;
    Card deck = new Card();
    Blackjack bj = new Blackjack("Blackjack");
    Player p1 = new Dealer("dealer", DEFAULT_AMOUNT);
    Player p2 = new BlackjackPlayer("player", DEFAULT_AMOUNT);
    ArrayList<String[]> p1Hand;
    ArrayList<String[]> p2Hand;
    double playersBet = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayBlackjack playBlackjack = new PlayBlackjack();
        playBlackjack.startGame();
    }

    private void startGame() {
        Blackjack bj = new Blackjack("Blackjack");

        bj.setPlayers(p1);
        bj.setPlayers(p2);

        for (int i = 0; i < ROUNDS; i++) {
            playOneRound(i);
        }
    }

    private void setUpCards() {
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                dealCard(1);
            } else {
                dealCard(2);
            }
        }
    }

    private void dealCard(int number) {
        if (number == 1) {
            deck.distributeCards(p1.getName());
        } else {
            deck.distributeCards(p2.getName());
        }
    }

    private void hitCards(int player) {
        Scanner input = new Scanner(System.in);
        boolean continueToDraw = true;

        while (continueToDraw) {

            if (player == 2) {

                // Calcute the amount
                calculateAmount(player);

                int sum = deck.returnCurrentHandValue(player);

                if (sum > 21) {
                    System.out.println("bust");
                    break;
                }

                System.out.println("Do you want to Hit or Stand (h/s)");
                String choice = input.nextLine();

                switch (choice) {
                    case "h":
                    case "H":
                        System.out.println("Hit");
                        dealCard(player);

                        showPlayersHand();

                        break;

                    case "s":
                    case "S":
                        System.out.println("Stand\n");
                        continueToDraw = false;
                        break;

                    default:
                        System.out.println("Please input h or s");
                }
            } else {
                dealersMove();
                calculateAmount(player);
                continueToDraw = false;
            }
        }
    }

    private void calculateAmount(int player) {
        int sum = deck.returnCurrentHandValue(player);

        System.out.println("The current hand value: " + sum);
    }

    private void showDealersHand(int number) {
        int showCards = 1;

        p1Hand = deck.returnHands(1);
        if (number == 1) {
            showCards = p1Hand.size();
        }

        System.out.println("Dealer's cards");
        for (int i = 0; i < showCards; i++) {
            String[] p1Cards = p1Hand.get(i);
            System.out.println(p1Cards[0] + " " + p1Cards[1]);
        }
    }

    private void showPlayersHand() {
        System.out.println();
        System.out.println("Player's cards");

        p2Hand = deck.returnHands(2);
        for (int i = 0; i < p2Hand.size(); i++) {
            String[] p2Cards = p2Hand.get(i);
            System.out.println(p2Cards[0] + " " + p2Cards[1]);
        }
    }

    private void dealersMove() {
        int sum = deck.returnCurrentHandValue(1);

        while (sum <= 16) {

            System.out.println("Dealer Hits");
            dealCard(1);
            showDealersHand(1);
            sum = deck.returnCurrentHandValue(1);
        }

        System.out.println("");
        System.out.println("Dealer Stands");
    }

    private void declareWinner(int situation) {
        int sumDealer = deck.returnCurrentHandValue(1);
            int sumPlayer = deck.returnCurrentHandValue(2);
        
        if (situation == 2) {
            if (sumPlayer == 21) {
                    ((BlackjackPlayer) (p2)).addToBalancePlayerGetsBlackJack(playersBet);
                } else {
                    ((BlackjackPlayer) (p2)).addToBalanceWin(playersBet);
                }
            System.out.println(RESULT[situation] + "\n");
        } else if (situation == 1) {
            System.out.println(RESULT[situation] + "\n");
        } else {
            

            int judge = sumPlayer - sumDealer;

            if (judge == 0) {
                // Pay back the money you bet
                ((BlackjackPlayer) (p2)).gameDraw(playersBet);
                System.out.println(RESULT[0] + "\n");
            } else if (judge > 0) {
                
                if (sumPlayer == 21) {
                    ((BlackjackPlayer) (p2)).addToBalancePlayerGetsBlackJack(playersBet);
                } else {
                    ((BlackjackPlayer) (p2)).addToBalanceWin(playersBet);
                }
                System.out.println(RESULT[2] + "\n");
            } else {
                System.out.println(RESULT[1] + "\n");
            }
        }
    }

    private void playOneRound(int round) {
        System.out.println("*******************************************************");
        System.out.println("Round " + (round + 1));
        System.out.println("*******************************************************");
        boolean isWinnerExist = false;

        // show player's balance
        System.out.println("The players balance: " + p2.getBalance());

        betMoneyTransaction();

        // Clean the deck
        deck.collectCards();

        setUpCards();

        p1Hand = deck.returnHands(1);
        p2Hand = deck.returnHands(2);

        showDealersHand(0);
        showPlayersHand();

        // Hit cards for the player
        hitCards(2);

        int sumPlayer = deck.returnCurrentHandValue(2);

        if (sumPlayer <= 21) {
            // After the player stands, the dealers hand shows up
            showDealersHand(1);

            // Hit cards for the dealer
            hitCards(1);
        } else {
            // Winner is the dealer
            declareWinner(1);
            isWinnerExist = true;
        }

        int sumDealer = deck.returnCurrentHandValue(1);

        if (!isWinnerExist) {
            if (sumDealer <= 21) {
                // compare values and declare a winner
                declareWinner(0);
            } else {
                // The winner is the player
                declareWinner(2);
            }
        }
        System.out.println("The players balance: " + p2.getBalance());
    }

    private void betMoneyTransaction() {
        Scanner input = new Scanner(System.in);
        boolean continueToAsk = true;

        while (continueToAsk) {
            if (p2 instanceof BlackjackPlayer) {
                try {
                    System.out.println("How much do you want to bet?");
                    String stringBet = input.nextLine();
                    playersBet = Double.parseDouble(stringBet);

                    if (playersBet <= 0.0) {
                        throw new InputMismatchException();
                    } else if (playersBet > p2.getBalance()) {
                        throw new Exception();
                    }

                    ((BlackjackPlayer) (p2)).betMoney(playersBet);
                    continueToAsk = false;
                    
                } catch (InputMismatchException ex) {
                    System.out.println("The bet amount should be positive number");
                } catch (Exception ex) {
                    System.out.println("The bet amount should be less than the balance");
                }
            }
        }
    }
}
