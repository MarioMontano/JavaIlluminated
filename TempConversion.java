/**
 * A program to convert a temperature in Fahrenheit to Celsius. 
 *
 * Mario Montano
 * 
 */
public class TempConversion
{
    public static void main( String [ ] args )
    {
       final double RATIO = 5.0/9.0;
       final double DIFFERENCE_IN_ZEROS = 32.0;
       
       int temperatureFahrenheit = 100;
       
       double temperatureCelsius = ( ( temperatureFahrenheit * RATIO ) 
                                       - DIFFERENCE_IN_ZEROS );
       
       System.out.print( temperatureCelsius );
       
       double temperatureFahrenheit2 = ( ( temperatureCelsius + DIFFERENCE_IN_ZEROS ) 
                                           / RATIO );
       
       System.out.print( "\n" + temperatureFahrenheit2 );
    }
}
