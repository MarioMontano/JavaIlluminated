
/**
 * Calculates and outputs the square of each integer from 1 to 9
 *
 * Mario Montano
 * 
 */
public class Squares 
{
    public static void printSquares(final int n) 
    {
        if (n > 1) 
        {
            printSquares(n - 1);
        }
        System.out.println(n * n);
    }

    public static void main(final String... args) 
    {
        printSquares(9);
    }
}
