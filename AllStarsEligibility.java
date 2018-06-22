/**
 * Takes number of hits and number of at-bats for a batter.
 * Then calculates the batter's hitting percentage.
 * If the hitting percentage is above .300, that batter is eligible for
 * the All Stars Game; otherwise, that batter is not eligible.
 *
 * Mario Montano
 * 
 */
 
import java.util.Scanner;
public class AllStarsEligibility
{
    public static void main(String [] args)
    { 
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter number of hits > ");
      int numberHits = scan.nextInt( );
      
      System.out.print("\nEnter number of at-bats > ");
      int numberAtBats = scan.nextInt( );
      
      double hittingPercentage = numberHits/(numberHits + numberAtBats);
      
      if (hittingPercentage > .300)
        System.out.print("This batter is eligible for the All Stars Game");
      else
        System.out.print("This batter is not eligible for the All Stars Game");  
    }
}
