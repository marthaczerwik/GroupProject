package playblackjack;
import java.util.ArrayList;

/**
 *
 * @author Shin
 */
public class Card {
    private final String[] VALUE = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] SUITS = {"Spade", "Heart", "Clover", "Diamond"};
    
    private int[][] cards = new int[4][13];
    
    
    public Card() {
        collectCards();
    }
    
    
    public int[][] distributeCards(String player) {
        
        while(true) {
            int suit = (int)(Math.random() * 4);
            int number = (int)(Math.random() * 13);
            
            if (cards[suit][number] == 0) {
                if (player.equals("dealer")) {
                    cards[suit][number] = 1;
                } else {
                    cards[suit][number] = 2;
                }
                break;
            }
        }
        
        return cards;
    }
    
    public void collectCards() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                cards[i][j] = 0;
            }
        }
    }
    
    public ArrayList<String[]> returnHands(int player) {
        ArrayList<String[]> hands = new ArrayList<>();
        
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                if (cards[i][j] == player) {
                    String[] cardInHand = {SUITS[i],VALUE[j]};
                    hands.add(cardInHand);
                }
            }
        }
        
        return hands;
    }
    
    public int returnCurrentHandValue(int player) {
        int value = 0;
        
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                if (cards[i][j] == player) {
                    if (j == 0) {
                        value += 11;
                    } else if (j >= 10) {
                        value += 10;
                    } else {
                        value += (j + 1);
                    }
                }
            }
        }
        
        return value;
    }
}
