package playblackjack;

/**
 *
 * @author Shin
 */
public class Dealer extends Player {

    private int[][] hands = new int[4][13];

    public Dealer(String name, double balance) {
        super(name, balance);
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
