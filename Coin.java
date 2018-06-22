/**
 * Encapsulates the concept of coins.
 * Mario Montano
 */

import java.text.DecimalFormat;
public class Coin
{
    
    private int numQuarter; 
    private int numDime;
    private int numNickel; 
    private int numPenny;
    
    public Coin( )
    {
        numQuarter = 0;
        numDime = 0;
        numNickel = 0;
        numPenny = 0;
    }
    
    public Coin(int startNumQuarter,
                int startNumDime,
                int startNumNickel,
                int startNumPenny)
    {
        setNumQuarter(startNumQuarter);
        setNumDime(startNumDime);
        setNumNickel(startNumNickel);
        setNumPenny(startNumPenny);
    }
    
    public int getNumQuarter( )
    {
        return numQuarter;
    }
    
    public int getNumDime( )
    {
        return numDime;
    }
    
    public int getNumNickel( )
    {
        return numNickel;
    }
    
    public int getNumPenny( )
    {
        return numPenny;
    }
    
    public void setNumQuarter(int newNumQuarter)
    {
       if ( newNumQuarter >= 0 )
            numQuarter = newNumQuarter;
        else
        {
            System.err.println("Quarters given is negative.");
            System.err.println("Value not changed.");
        } 
       
    }
    
    public void setNumDime(int newNumDime)
    {
    if ( newNumDime >= 0 )
            numDime = newNumDime;
        else
        {
            System.err.println("Dimes given is negative.");
            System.err.println("Value not changed.");
        }
    }
    
    public void setNumNickel(int newNumNickel)
    {
    if ( newNumNickel >= 0 )
            numDime = newNumNickel;
        else
        {
            System.err.println("Nickels given is negative.");
            System.err.println("Value not changed.");
        }
    }
    
    public void setNumPenny(int newNumPenny)
    {
    if ( newNumPenny >= 0 )
            numDime = newNumPenny;
        else
        {
            System.err.println("Pennies given is negative.");
            System.err.println("Value not changed.");
        }
    }
    
    public double calculateValueofQuarters( )
    {
        return numQuarter * .25;
    }
    
    public double calculateValueofDimes( )
    {
        return numDime * .10;
    }
    
    public double calculateValueofNickels( )
    {
        return numNickel * .05;
    }
    
    public double calculateValueofPennies( )
    {
        return numPenny * .01;
    }
    
    public double calculateTotalValue( )
    {
        return calculateValueofQuarters( ) +
               calculateValueofDimes( ) +
               calculateValueofNickels( ) +
               calculateValueofPennies( );
    }
    
    public double calculateTotalQuarters( )
    {
        return calculateTotalValue( ) / .25;
    }
    
    public double calculateTotalDimes( )
    {
        return calculateTotalValue( ) / .10;
    }
    
    public double calculateTotalNickels( )
    {
        return calculateTotalValue( ) / .05;
    }
    
    public double calculateTotalPennies( )
    {
        return calculateTotalValue( ) / .01;
    }
    
    public String toString( )
    {
        DecimalFormat coinageFormat = new DecimalFormat("###,###.00");
        return "Total in quarters: " + coinageFormat.format(calculateTotalQuarters( ))
                + "; Total in dimes: " + coinageFormat.format(calculateTotalDimes( ))
                + "; Total in nickels: " + coinageFormat.format(calculateTotalNickels( ))
                + "; Total in pennies: " + coinageFormat.format(calculateTotalPennies( ));
    } 
    
    public boolean equals(Object o)
    {
        if(!(o instanceof Coin))
            return false;
        else
        {
            Coin objCoin = (Coin) o;
            if(numQuarter == objCoin.numQuarter
                && numDime == objCoin.numDime
                && numNickel == objCoin.numNickel
                && numPenny == objCoin.numPenny)
                return true;
            else
                return false;
        }
    }
}
