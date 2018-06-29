/**
 * Test by printing.
 *
 * Mario Montano
 */
public class ProblemSeventyOneTest
{
    public static void main( String[ ] args)
    {
        int n = 3;
        char [ ][ ] a = { { 3, 3, 2 },
                          { 24, 4, 4, 5 } };

        int count = 0;
        for ( int i = 0; i < a.length; i++ )
        {
            if ( a[i].length == n )
                count++;
        }
        System.out.print(count);
    }
}
