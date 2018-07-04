/**
 * 
 * A program that converts 2, 5, and 10 inches to millimeters (1 inch = 25.4 mm). 
 * Mario Montano
 * 
 */
public class ConvertInchesToMillimeters
{
    public static void main(String [] args)
    {
        final double MM_PER_INCH = 25.4;
        double inch1 = 2;
        double inch2 = 5;
        double inch3 = 10;
        double inch1InMm = inch1/MM_PER_INCH;
        double inch2InMm = inch2/MM_PER_INCH;
        double inch3InMm = inch3/MM_PER_INCH;
        System.out.println("inches in millimeters are: " + inch1InMm + "\n" + inch2InMm +
        "\n" + inch3InMm);
    }
}
