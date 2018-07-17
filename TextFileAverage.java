/**
 * Reads data from file, calculates total, and prints average.
 *
 * Mario Montano
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class TextFileAverage
{
    public static void main(String[ ] args) throws IOException
    {
        double number;
        
        File inputFile = new File("input.txt");
        Scanner file = new Scanner(inputFile);
        
        int count = 0;
        int total = 0;
        
        while( file.hasNext( ) )
        {
            number = file.nextInt( );
            total += number;
            count++;
            System.out.println( number );
        }
        if ( count != 0 )
        {
            System.out.println( "The average is " + ( total / count ) );
        }
    }
}
