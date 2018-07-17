
/**
 * Generates random integers between 3 and 7 until a 5 is generated
 * and prints them all out.
 *
 * Mario Montano
 * 
 */
 
import java.util.Random; 

public class RandomIntsBetweenThreeAndSeven 
{	
  public static void main( String [ ] args ) 
	{		
    Random random = new Random( );
		int i = 0;		
    while( i != 5 )		
    { 
			i = (int)( 5 * Math.random( ) + 3 );
			System.out.print( i ); 
		} 
	} 
} 
