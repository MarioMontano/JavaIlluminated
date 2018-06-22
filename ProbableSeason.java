/**
 * Outputs probable season (winter, summer, spring, or fall) depending on
 * the temperature input.
 *
 * Mario Montano
 * 
 */
import java.util.Scanner;
public class ProbableSeason
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter temperature as a whole number > ");
        int temp = scan.nextInt( );
        
        if (temp > 110 || temp < -5 )
            System.out.print("Temperature entered is outside valid range");
        if (temp >= 90 && temp <= 110)
            System.out.print("It is probably summer.");
        if (temp >= 70 && temp < 90)
            System.out.print("It is probably spring.");
        if (temp >= 50 && temp < 70)
            System.out.print("It is probably fall.");    
        if (temp < 50 && temp >= -5)
            System.out.print("It is probably winter.");
    }
}
