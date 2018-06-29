/**
 * Test by printing.
 *
 * Mario Montano
 * 
 */
public class ProblemSixtyNineTest
{
    public static void main( String[ ] args)
    {
    int numberFloats = 0;
    
    double [ ][ ] floatsList = { { 0, 5, 10 },
                                 { 0, 3, 6, 9 } };

    for ( int i = 0; i < floatsList.length; i++ )
    {
        for ( int j = 0; j < floatsList[i].length; j++ )
        {
            numberFloats++;
        }
    }
    System.out.println(numberFloats);
    }
}
