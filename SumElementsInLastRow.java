/**
 * A value-returning method that returns the sum of the elements in the 
 * last column of each row in a two-dimensional array of ints. Includes code 
 * to test your method.
 *
 * Mario Montano
 * 
 */
public class SumElementsInLastRow
{
    public static void main( String [] args )
    {
        int cols = 3;
        int rows = 4;
        int [][] arrayName = 
            { { 0, 1, 3, 1 }, { 10, 11, 1, 1 }, { 3, 2, 5, 7 } };    
    }
    public static int lastColumnSum( int [][] array )
    {
        int sum = 0;
        
        for ( int i = 0; i < array.length; i++ )
        {    
                sum += array[i][array.length - 1];
        } 
        return sum;
    }
}    
