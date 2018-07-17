/**
 * Class encapsulating the concept of a game.
 *
 * Mario Montano
 * 
 */
public class Game
{
    private String description;
    
    public Game( String newDescription )
    {
        setDescription( newDescription );
    }
    public String getDescription( )
    {
        return description;
    }
    
    public void setDescription( String newDescription )
    {
        description = newDescription;
    }
    
    public String toString( )
    {
        return ( "description: " + description );
    }
}
