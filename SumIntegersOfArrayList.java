/**
 * A method that returns the sum of all the elements of an ArrayList of 
 * Integer objects. Includes code to test the method.
 *
 * Mario Montano
 * 
 */
import java.util.ArrayList;

public class SumIntegersOfArrayList
{
    public static void main (String args [])
    {
        ArrayList<Integer> list = new ArrayList<Integer>( );
        list.add( 34 );
        list.add( 89 );
        list.add( 65 );
        System.out.print( listSum( list ) );
    }
    public static int listSum(ArrayList<Integer> list)
    {
        int intsum = 0;
     
        for( int i = 0; i < list.size( ); i++ )
        {
            intsum += list.get( i );
        }
        return intsum;
    }   
}
