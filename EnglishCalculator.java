/**
 * A simple “English language” calculator that does the following: 
 * takes three inputs from the keyboard, two of them single digits 
 * (0 to 9) takes a char from the keyboard, representing one of five 
 * operations from the keyboard: + (addition), – (subtraction), 
 * (multiplication), / (division), and ^ (exponentiation) 
 * outputs the description of the operation in plain English, 
 * as well as the numeric result.
 *
 * Mario Montano
 *
 */
import java.util.Scanner;
public class EnglishCalculator
{
    public static void main(String [ ] args)
    {
        String operation;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator");
        
        System.out.print("Enter first operand > ");
        int a = scan.nextInt( );
        System.out.println("You entered " + a);
        
        System.out.print("Enter second operand > ");
        int b = scan.nextInt( );
        System.out.println("You entered " + b);
        
        System.out.println("\nOperations are: "
                            + "\n\t ADD or + for addition"
                            + "\n\t SUBTRACT or - for subtraction"
                            + "\n\t MULTIPLY or * for multiplication"
                            + "\n\t DIVIDE or / for division"
                            + "\n\t EXPONENTIATE or ^ for exponentiation");
        System.out.print("Enter your selection: ");
        operation = scan.next( );
        operation = operation.toUpperCase( );
        System.out.println("You entered " + operation); 
        
        switch(a)
        {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println(a + " is not valid. Select from 0 through 9.");
                break;
        }
        switch(operation)
        {
            case "ADD":
            case "+":
                System.out.println("plus");
                break; 
            case "SUBTRACT":
            case "-":
                System.out.println("minus");
                break;
            case "MULTIPLY":
            case "*":
                System.out.println("times");
                break;
            case "DIVIDE":
            case "/":
                if (b == 0)
                    System.out.println("Dividing by 0 is not allowed");
                else
                    System.out.println("divided by");
                break;
            case "EXPONENTIATE":
            case "^":
                System.out.println("raised to the power of");
                break;
            default:
                System.out.println(operation + " is not valid.");
                break;
            }
        switch(b)
        {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one equals ");
                break;
            case 2:
                System.out.println("two equals ");
                break;
            case 3:
                System.out.println("three equals ");
                break;
            case 4:
                System.out.println("four equals ");
                break;
            case 5:
                System.out.println("five equals ");
                break;
            case 6:
                System.out.println("six equals ");
                break;
            case 7:
                System.out.println("seven equals ");
                break;
            case 8:
                System.out.println("eight equals ");
                break;
            case 9:
                System.out.println("nine equals ");
                break;
            default:
                System.out.println(b + " is not valid. Select from 0 through 9.");
                break;
        }
        switch(operation)
        {
            case "ADD":
            case "+":
                System.out.println(a+b);
                break; 
            case "SUBTRACT":
            case "-":
                System.out.println(a-b);
                break;
            case "MULTIPLY":
            case "*":
                System.out.println(a*b);
                break;
            case "DIVIDE":
            case "/":
                if (b == 0)
                    System.out.println("Dividing by 0 is not allowed");
                else
                    System.out.println(a/b);
                break;
            case "EXPONENTIATE":
            case "^":
                System.out.println(Math.pow(a,b));
                break;
            default:
                System.out.println(operation + " is not valid.");
                break;
        }    
}
}
