package playblackjack;
import java.util.ArrayList;

/**
 *
 * @author Shin
 */
public abstract class Game {
    private String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    public Game(String givenName) {
        this.gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(Player players) 
    {
        this.players.add(players);
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

   
    
}//end class
