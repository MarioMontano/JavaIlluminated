import java.util.Scanner;
public class Factorial
{
    public static void main( String [] args)
    {
        int input;
        int n = 1;
        int m = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer");
        
        input = scan.nextInt( );
        
        while(n != input)
        {
            n = n + 1;
            m *= n;    
        }
        System.out.println("The factorial of input is " + m);
    }
}
