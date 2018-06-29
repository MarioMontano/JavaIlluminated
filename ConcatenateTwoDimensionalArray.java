/**
 * a method that returns the concatenation of all elements 
 * in a two-dimensional array of Strings
 *
 * Mario Montano
 * 
 */
public class ProblemEighty
{
    String concatenateStrings( String [ ][ ] stringList)
    {
        String s = " ";
        for (int i = 0; i < stringList.length; i++) 
        {
            for ( int j = 0; j < stringList[i].length; j++ )
            {
              s = s + stringList[i];
              if (i < stringList.length-1)
                s = s + " ";  
            }
        }
        return s;
    }   
}
