/**
 * returns the number of elements in a two-dimensional array of floats
 *
 * Mario Montano
 * 
 */
 public class ProblemSixtyNine
{
    float [ ][ ] floatsList = { { 0, 5, 10 },
                                 { 0, 3, 6, 9 } };
    int getFloats( float [ ][ ] floatsList)
    {
    int numberFloats = 0;
    for ( int i = 0; i < floatsList.length; i++ )
    {
        for ( int j = 0; j < floatsList[i].length; j++ )
        {
            numberFloats++;
        }
    }
    return numberFloats;
    }
}
