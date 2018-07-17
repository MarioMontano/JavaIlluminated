
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

public class ExamGradesMinMaxAvg
{
    public static void main(String args[])
    {
        int count = 0;
        double total = 0.0;
        double score;
        double maxScore;
        double minScore;
    
        Scanner scan = new Scanner( System.in );
        
        System.out.println("To calculate a class average, maximum, and minimum,"
                            + "enter each test score.");
        
        System.out.print( "Enter the first test score > " );
        score = scan.nextDouble( );
        maxScore = minScore = score;
  
        while( count != 9 && score >= 0.0 && score <= 100.0 )
        {
            total += score;
            count++;
            
            System.out.print( "Enter the next test score > " );
            score = scan.nextDouble( );
            if ( score > maxScore )
                maxScore = score;
            if ( score < minScore )
                minScore = score;
        }
        double average = total / count;
    
        System.out.println("\nThe class average is "
        + average + 
        " The class maximum is "
        + maxScore + 
        " The class minimum is "
        + minScore );
    }
}
