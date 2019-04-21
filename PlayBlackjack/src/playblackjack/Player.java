package playblackjack;
import java.util.ArrayList;
public abstract class Player {

	private String playerID;
        protected String name;
        protected double balance;
        
        int[][] hands = new int[4][13];

	/**
	 * 
	 * @param name
	 */
	public Player(String name, double balance) {
            this.name = name;
            this.balance = balance;
	}

	public void play() {
		// TODO - implement Player.play
		throw new UnsupportedOperationException();
	}
        
        public double getBalance() {
            return balance;
        }
        
        abstract String getName();
        
        abstract void setHand(int[][] cards);
}