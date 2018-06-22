/**
 * Takes a char as input and outputs whether it is a digit.
 *
 * Mario Montano
 * 
 */
import java.util.Scanner;
public class IsItDigit
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter char > ");
        String Input = scan.next( );
        char initial = Input.charAt(0);
        
        if (Character.isDigit(initial))
            System.out.print("Is digit");
        else
            System.out.print("Is not digit");    
    }
}
