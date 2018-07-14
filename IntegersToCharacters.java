/**
 * A method that takes an ArrayList of Integer objects and returns an 
 * ArrayList of Character objects of the same size. The returned elements of 
 * the ArrayList are assigned a letter grade corresponding to the integer 
 * grade of the same index element of the ArrayList parameter (A if 90 or 
 * above, …, F if less than 60). Includes code to test the method.
 * Mario Montano
 * 
 */
import java.util.ArrayList;

public class IntegersToCharacters
{
    public static void main( String [] args )
    {
        ArrayList<Integer> listOfInts = new ArrayList<Integer>( );
        listOfInts.add( 34 );
        listOfInts.add( 89 );
        listOfInts.add( 65 );
        listOfInts.trimToSize( );
        
        System.out.print( returningGrade( listOfInts ) );
    }
    public static ArrayList<Character> returningGrade( ArrayList<Integer> listOfInts )
    {
        ArrayList<Character> returnResult = new ArrayList<Character>( );
        for ( Integer currentInteger : listOfInts ) 
        {
            if ( currentInteger >= 90 ) 
            {
                returnResult.add( new Character( 'A' ) );
            } 
            else if ( currentInteger >= 80 ) 
            {
                returnResult.add( new Character( 'B' ) );
            } 
            else if ( currentInteger >= 70 ) 
            {
                returnResult.add( new Character( 'C' ) );
            } 
            else if ( currentInteger >= 60 ) 
            {
                returnResult.add( new Character( 'D' ) );
            } 
            else 
            {
                returnResult.add( new Character( 'F' ) );
            }
        }
        returnResult.trimToSize( );
        return returnResult;
    }
}
