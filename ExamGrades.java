
/**
 * Using a loop, this program takes 10 values representing 
 * exam grades (between 0 and 100) from the keyboard and outputs the 
 * minimum value, maximum value, and average value of all the values 
 * entered. This program does not accept values less than 0 or greater 
 * than 100.
 *
 * Mario Montano
 * 
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

public class ExamGrades
{
    public static void main(String args[])
{
    int count = 0;
    int total = 0;
    int score;
    int maxScore;
    int minScore;
    
    Scanner scan = new Scanner(System.in);

    
    System.out.println("To calculate a class average, maximum, and minimum,");
    System.out.println("enter each test score.");
    
    System.out.print("Enter the first test score > ");
    score = scan.nextInt( );
    maxScore = scan.nextInt( );
    minScore = scan.nextInt( );
    
    while(count != 9 && score >= 0 && score <= 100)
    {
        total += score;
        count++;
        
        System.out.print("Enter the next test score > ");
        score = scan.nextInt( );
        maxScore = score;
        minScore = score;
        if (score > maxScore)
            maxScore = score;
        if (score < minScore)
            minScore = score;
    }

    
    
    DecimalFormat oneDecimalPlace = new DecimalFormat("0.0");
    System.out.println("\nThe class average is "
     + oneDecimalPlace.format((double)(total)/count) + " The class maximum is "
     + oneDecimalPlace.format((double)(maxScore)) + " The class minimum is "
     + oneDecimalPlace.format((double)(minScore)));
}
}
