/**
 * A method with a void return value that sets to 0 all the elements of the 
 * even-numbered rows and sets to 1 all the elements of odd-numbered rows of 
 * a two-dimensional array of ints. Include code to test your method.
 *
 * Mario Montano
 * 
 */
public class EvensZeroOddsOne
{
    public static void main( String [] args )
    {
        int cols = 3;
        int rows = 4;
        int [][] arrayName = 
            { { 0, 1, 3, 1 }, { 10, 11, 1, 1 }, { 3, 2, 5, 7 } };    
    }
    public static void zerosevensonesodds( int [][] array )
    {
        for ( int i = 1; i < array.length; i+=2 )
        {
            for ( int j = 0; j < array[i].length; j++ )
            {
                array[i][j] = 1;
            } 
        }
    }    
}
