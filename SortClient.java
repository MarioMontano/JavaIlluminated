/** Client for Sort
*   Mario Montano
*   Comment out the print statements for sort duration.
*/
import java.util.Random;

public class SortClient
{
   public static void main( String [ ] args )
   {
     // instantiate an array and fill with random values
     int [ ] numbers = new int [100000];
     Random rand = new Random( );
     for ( int i = 0; i < numbers.length; i++ )
     {
       numbers[i] = rand.nextInt( 5000 ) + 1;
     }
     
     System.out.println( "Before Insertion Sort, the array is" );
     for ( int i = 0; i < numbers.length; i++ )
        System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     Sorter.insertionSort( numbers ); // sort the array

     System.out.println( "\nAfter Insertion Sort, the array is"  );
     for ( int i = 0; i < numbers.length; i++ )
          System.out.print( numbers[i] + "\t" );
     System.out.println( );
     
     // instantiate an array and fill with random values
     int [ ] numbers2 = new int [100000];
     Random rand2 = new Random( );
     for ( int i = 0; i < numbers2.length; i++ )
     {
       numbers2[i] = rand.nextInt( 5000 ) + 1;
     }
     
     System.out.println( "Before Bubble Sort, the array is" );
     for ( int i = 0; i < numbers2.length; i++ )
        System.out.print( numbers2[i] + "\t" );
     System.out.println( );
     
     Sorter.bubbleSort( numbers2 );
     System.out.println( "\nAfter Bubble Sort, the array is"  );
     for ( int i = 0; i < numbers2.length; i++ )
          System.out.print( numbers2[i] + "\t" );
     System.out.println( );
     
     int [ ] numbers3 = new int [100000];
     Random rand3 = new Random( );
     for ( int i = 0; i < numbers3.length; i++ )
     {
       numbers3[i] = rand.nextInt( 5000 ) + 1;
     }
     
     System.out.println( "Before Selection Sort, the array is" );
     for ( int i = 0; i < numbers3.length; i++ )
        System.out.print( numbers3[i] + "\t" );
     System.out.println( );
     
     Sorter.bubbleSort( numbers3 );
     System.out.println( "\nAfter Selection Sort, the array is"  );
     for ( int i = 0; i < numbers3.length; i++ )
          System.out.print( numbers3[i] + "\t" );
     System.out.println( );
     
     
     
     long startTime, stopTime;
     double duration;
     
     startTime = System.nanoTime();
     Sorter.insertionSort( numbers );
     stopTime = System.nanoTime();
     
     duration = ( stopTime - startTime ) / 1000000000.0;
     System.out.println( "Insertion sort took " + duration
                     + " seconds.");
                     
     startTime = System.nanoTime();
     Sorter.insertionSort( numbers2 );
     stopTime = System.nanoTime();
     
     duration = ( stopTime - startTime ) / 1000000000.0;
     System.out.println( "Bubble sort took " + duration
                     + " seconds.");
                     
     startTime = System.nanoTime();
     Sorter.insertionSort( numbers3 );
     stopTime = System.nanoTime();
     
     duration = ( stopTime - startTime ) / 1000000000.0;
     System.out.println( "Selection sort took " + duration
                     + " seconds.");
                          
   }
}
