/**
 * A class encapsulating a grocery store, which inherits from Store. 
 * This grocery store has the following additional attributes: annual 
 * revenues and whether it is an independent store or part of a chain.
 * It contains the constructor and the toString method of the new class; 
 * it also contains a method returning the annual taxes paid by the store. 
 * 
 * Mario Montano
 * 
 */
import java.text.DecimalFormat;

public class GroceryStore extends Store
{
  public double annualRevenues;
  public String independence;
  public double annualTaxes;
  
  public GroceryStore( )
  {
      annualRevenues = 50000000;
      independence = "independent store";
      annualTaxes = 2000000;
  }
  public GroceryStore( double startAnnualRevenues,
                       String startIndependence)
  {
      annualRevenues = startAnnualRevenues;
      independence = startIndependence;     
  }
  public String toString( )
  {
      DecimalFormat dollarsFormat = new DecimalFormat("$###,###,###,###.00");
      return "Annual revenues: " + dollarsFormat.format( annualRevenues )
             +"; independence: " + independence;
  } 
  public double getAnnualTaxes( )
  {
      return annualTaxes;
  }  
}
