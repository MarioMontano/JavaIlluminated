/**
 * a value-returning method that returns the number of columns with 
 * n elements in a two-dimensional array of chars, 
 * where n is a parameter of the method
 *
 * Mario Montano
 * 
 */
public class ColumnsWithNElements
{
int columnsOfSize(int n, char [ ][ ] a)
  {
      int count = 0;
      for ( int i = 0; i < a.length; i++ )
      if ( a[i].length == n )
        count++;
      return count;
  }
}
