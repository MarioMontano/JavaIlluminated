/**
 * Test by printing.
 *
 * Mario Montano
 * 
 */
public class ConcatenateTwoDimensionalArrayTest.java
{
    public static void main( String[ ] args)
    {
        String [ ][ ] stringList = { { "3", "ui", "uo" },
                                  { "4e", "er", "io", "eo" } };
        String s = " ";
        for (int i = 0; i < stringList.length; i++) 
        {
            for ( int j = 0; j < stringList[i].length; j++ )
            {
              s = s + stringList[i][j];  
            }
        }
        System.out.print(s);
    }
}
