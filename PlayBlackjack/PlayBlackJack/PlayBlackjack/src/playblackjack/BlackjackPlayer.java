package playblackjack;

/**
 *
 * @author Shin
 */
public class BlackjackPlayer extends Player {

    private final double DEFAULT_AMOUNT = 1000;
    double bet; 

    /**
     *
     * @param name
     * @param money
     */
    public BlackjackPlayer(String name, double balance) {
        super(name, balance);
        balance = DEFAULT_AMOUNT;
    }

    public void play() {
        // TODO - implement BlackjackPlayer.play
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param bet
     */
    public void betMoney(double bet) {
        balance -= bet; 
    }
    
    public double getMoney(double bet) {
       return this.bet;
    }
    
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setHand(int[][] cards) {
        hands = cards;
    }
    
    public double addToBalanceWin(double bet) {
      super.balance += (bet * 3); 
      return balance;
   }  
   
     public double addToBalancePlayerGetsBlackJack(double bet) {
      balance += (bet * 4); 
      return balance;
   }
   
   public double gameDraw(double bet) {
      balance = balance + bet;
      return balance;
   }
}
