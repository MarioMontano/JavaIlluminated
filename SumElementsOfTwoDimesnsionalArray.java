/**
 * a value-returning method that returns the sum of all the elements 
 * in a two-dimensional array of floats
 *
 * Mario Montano
 * 
 */
public class SumElementsOfTwoDimesnsionalArray
{
    float [ ][ ] floatsList = { { 0, 5, 10 },
                                { 0, 3, 6, 9 } };
                                
    float addFloats( float [ ][ ] floatsList)
    {
        float sumOfFloats = 0;
        for ( int i = 0; i < floatsList.length; i++ )
        {
            for ( int j = 0; j < floatsList[i].length; j++ )
            {
                sumOfFloats = sumOfFloats + floatsList[i][j];
            }
        }
        return sumOfFloats;
    }
}
