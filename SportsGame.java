/**
 * A class encapsulating a sports game, which inherits from Game. A sports
 * game has the following additional attributes: whether the game is a team
 * or individual game, and whether the game can end in a tie. Contains code
 * for the constructor and the toString method of the new class. 
 *
 * Mario Montano
 * 
 */
public class SportsGame extends Game
{
    public boolean teamOrIndividual;
    public boolean tieOrNot;
    public SportsGame( String description )
    {
        super( description );
    }
    public String toString( )
    {
        return "Team game: " + teamOrIndividual
                + "; Tie allowed: " + tieOrNot;
    }    
}
