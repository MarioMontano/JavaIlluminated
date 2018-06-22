/**
Mario Montano
 */
import java.util.*; // includes Scanner and Random classes
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class LettersInFirstNameLifeExpAndGuessRandomNumber
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scan.next( );
        System.out.println("Hello, " + firstName);
        System.out.println("The number of letters in" + firstName + " is "
        + firstName.length( ));
        
        System.out.println("\nEnter the year you were born: ");
        int birthYear = scan.nextInt( );
        int age = 2018 - birthYear;
        final double AVG_LIFE_EXP = 78.7;
        DecimalFormat percent = new DecimalFormat("0.0#%");
        System.out.println("You have lived " + 
        percent.format(age / AVG_LIFE_EXP) + " of your life.");
        
        Random rand = new Random( );
        int randInt = rand.nextInt(20) + 1;
        String guessStr = JOptionPane.showInputDialog(null, "Enter a number between one and twenty");
        int guess = Integer.parseInt(guessStr);
        JOptionPane.showMessageDialog(null, "the random number, " + randInt + "was" + Math.abs(randInt - guess) 
                                        + " away from your guess");
            
    }
}
