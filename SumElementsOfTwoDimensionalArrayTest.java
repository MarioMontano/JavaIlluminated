/**
 * Test by printing.
 *
 * Mario Montano
 * 
 */
public class SumElementsOfTwoDimensionalArrayTest
{
    public static void main( String[ ] args)
    {
        float [ ][ ] floatsList = { { 0, 5, 10 },
                                  { 0, 3, 6, 9 } };
        float sumOfFloats = 0;
        for ( int i = 0; i < floatsList.length; i++ )
        {
            for ( int j = 0; j < floatsList[i].length; j++ )
            {
                sumOfFloats = sumOfFloats + floatsList[i][j];
            }
        }
        System.out.print(sumOfFloats);
    }
}
