package playblackjack;

/**
 *
 * @author Shin
 */
public class Dealer extends Player {

    private static int displayedCards = 1;
    private int[][] hands = new int[4][13];

    public Dealer(String name, double balance) {
        super(name, balance);
    }

    public static void openOneCards() {
        displayedCards++;
    }

    public void play() {
        // TODO - implement Dealer.play
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String getName() {
        return super.name;
    }
    
    
    @Override
    public void setHand(int[][] cards) {
        hands = cards;
    }
}
