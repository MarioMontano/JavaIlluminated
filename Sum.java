/**
 * Sum from 1 to input.
 *
 * Mario Montano
 * 
 */
import java.util.Scanner;
public class Sum
{
    public static void main( String [] args)
    {
        int input;
        int n = 0;
        int m = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer");
        
        input = scan.nextInt( );
        
        while(n != input)
        {
            n = n + 1;
            m += n;    
        }
        System.out.println("The sum from 1 to input is " + m);
}
}
