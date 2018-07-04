/**
 * A program that calculates and outputs the average of integers 1, 7, 9, and 34.
 *
 * Mario Montano
 * 
 */
public class AverageIntegers
{
    public static void main(String[] args)
    {
        int num1, num2, num3, num4;
        float average, sum;
        num1 = 1;
        num2 = 7;
        num3 = 9;
        num4 = 34;
        sum = num1 + num2 + num3 + num4;
        average = sum/4;
        System.out.print(" The average of them is : " + average);
    }    
}
