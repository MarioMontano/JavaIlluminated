/**
 * Using template and no chapter 3 knowledge.
 *
 * Mario Montano
 * 
 */
public class TemperatureConversion
{
    public static void main(String[] args)
    {
      final double RATIO  = (5.0 / 9.0);
      final double DIFFERENCE_IN_ZEROS = 32.0;
      int fahrenheit = 348;
      double celsius = (fahrenheit - DIFFERENCE_IN_ZEROS) * RATIO;
      System.out.println(celsius);
      //double fahrenheit = (celsius / RATIO) + 32;
      //System.out.println(fahrenheit);
    }
}
