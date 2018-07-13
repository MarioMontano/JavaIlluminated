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
        list.add( new Integer( 34 ) );
        list.add( new Integer( 89 ) );
        list.add( 65 );
    }
    public int listSum(ArrayList<Integer> pList)
    {
        int intsum = 0;
     
        for( int i = 0; i < pList.size(); i++ )
        {
            intsum += pList.get(i);
        }
        return intsum;
    }   
}
