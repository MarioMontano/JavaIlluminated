/**
 * Generates three random integers between 0 and 50, calculates the average,
 * and prints the result to one decimal place.

 *
 * Mario Montano
 *
 */
import java.util.Random;
import java.text.DecimalFormat;
public class RandomAverage
{
    public static void main(String[] args) 
    {
        DecimalFormat oneDecimal = new DecimalFormat("0.0#");
        
        int num1,num2,num3;
        int sum,average;
        
        Random random = new Random();
        
        num1 = random.nextInt(51);
        num2 = random.nextInt(51);
        num3 = random.nextInt(51);
        
        sum = num1 + num2 + num3;
        average = sum/3;
        
        System.out.print(" The average of them is : " + oneDecimal.format(average));
    }
}
