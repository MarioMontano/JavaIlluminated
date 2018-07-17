/**
 * This loop takes words as input from the user and concatenates them until 
 * the user types in the word “end” ( which is not concatenated ). The code 
 * then outputs the concatenated String.
 *
 * Mario Montano
 * 
 */
import java.util.Scanner;

public class ConcatenateTillTheEnd
{
    public static void main( String [ ] args )
    {
        String sentence = "";
        String word = " ";
        Scanner scan = new Scanner( System.in );

        while ( ! word.equals( "end" ) )
        {
            sentence += word;
            
            System.out.print ("Enter a word > ");
            
            word = scan.next( );
        }
        System.out.println( "The sentence is " + sentence );
    }
}
