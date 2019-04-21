package playblackjack;
import java.util.ArrayList;

/**
 *
 * @author Shin
 */
public abstract class Game {
    private String gameName;//the title of the game
    private ArrayList <Player> players = new ArrayList();// the players of the game
    
    public Game(String givenName) {
        this.gameName = givenName;
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
}//end class
