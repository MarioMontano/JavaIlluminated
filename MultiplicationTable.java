import java.util.Scanner;
/**
Mario Montano
Multiplication table that can be made as large as you want.
 */
public class MultiplicationTable 
{
    public static void main(String[] args)    
    {
        Scanner keyboard = new Scanner (System.in);
        int x=0, y=0;
        System.out.print("Enter rows ");
        x = keyboard.nextInt();
        System.out.print("Enter columns ");
        y = keyboard.nextInt();

        for (int i=1; i<=x; i++) 
        {
            for (int j=1; j<=y; j++)
            {
                System.out.print("\t"+ i*j);
            }
            System.out.println(); 
        }
    }
}

