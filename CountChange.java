/**
 *     This program will add up the value of a number of quarters,
       dimes, nickels, and pennies.The number of each type of 
       coin is input by the user.The total value is reported
       in dollars. 
 *
 * Mario Montano
 * 
 */

import java.util.Scanner;
public class CountChange 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      
      int quarters;  
      int dimes;      
      int nickels;             
      
      double dollars; 
      
      System.out.print("Enter the number of quarters:  ");
      quarters = input.nextInt();
      
      System.out.print("Enter the number of dimes:     ");
      dimes = input.nextInt();
      
      System.out.print("Enter the number of nickels:   ");
      nickels = input.nextInt();
      
      
      dollars = (0.25 * quarters) + (0.10 * dimes) 
                          + (0.05 * nickels); 
      
      
      
      System.out.println();
      System.out.print("The total in dollars is $");
      System.out.printf("%1.2f", dollars);
      System.out.println();
   
   }  
 
}  

