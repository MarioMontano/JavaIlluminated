/**
 * Converts Fahrenheit to Celsius
 *
 * Mario Montano
 * 
 */
import java.util.Scanner;
public class FahrenheitToCelsius
{
    public static void main(String [] args)
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit - 32)*(0.5556);
        System.out.println("Temperature in Celsius:" + celsius);
    }
}
