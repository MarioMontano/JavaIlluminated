/**
 * Testing the methods in Coin.
 *
 * Mario Montano
 * 
 */
public class CoinClient
{
    public static void main(String[] args)
    {
        Coin pile = new Coin(1,2,3,4);
        
        System.out.println("number of quarters is " + pile.getNumQuarter( )
                    + "\n number of dimes is " + pile.getNumDime( )
                    + "\n number of nickels is " + pile.getNumNickel( ) 
                    + "\n number of pennies is " + pile.getNumPenny( ));
        
        pile.setNumQuarter(5);
        pile.setNumDime(6);
        pile.setNumNickel(7);
        pile.setNumPenny(8);
        
        System.out.println("\nnumber of quarters is " + pile.getNumQuarter( )
                    + "\n number of dimes is " + pile.getNumDime( )
                    + "\n number of nickels is " + pile.getNumNickel( ) 
                    + "\n number of pennies is " + pile.getNumPenny( ));  
         
        pile.setNumQuarter(-1);
        
        System.out.println("\nnumber of quarters is " + pile.getNumQuarter( )
                    + "\n number of dimes is " + pile.getNumDime( )
                    + "\n number of nickels is " + pile.getNumNickel( ) 
                    + "\n number of pennies is " + pile.getNumPenny( )); 
                    
        double quarterage = pile.calculateTotalQuarters( );
        System.out.println("Amount in quarters is "
                            + quarterage);
                            
        double dimeage = pile.calculateTotalDimes( );
        System.out.println("Amount in dimes is "
                            + dimeage);
                            
        double nickelage = pile.calculateTotalNickels( );
        System.out.println("Amount in nickels is "
                            + nickelage);
                            
        double penniage = pile.calculateTotalPennies( );
        System.out.println("Amount in pennies is "
                            + penniage);
                    
        Coin pouch = new Coin(9,0,0,0);
        System.out.println(pouch.toString( ));
        
        Coin pocket = new Coin(10,0,0,0);
        System.out.println( );
        System.out.println(pocket);
        
        if(pocket.equals(pouch))
            System.out.println("\npouch and pocket are equal");
        else
            System.out.println("\npouch and pocket are not equal");
    }
}
