/**
 * All-inclusive vacation which has three additional attributes: a brand 
 * (for instance ClubMed®); a rating, expressed as a number of stars; and a price. 
 *
 * Mario Montano
 * 
 */
public class AllInclusiveVacation extends Vacation
{
    private String brand;
    private int rating;
    private double cost;
    private double budget;
    
    public AllInclusiveVacation( )
    {
        super( );
        brand = "unknown";
        rating = 0;
        cost = 0.00;
    }
    
    public AllInclusiveVacation( String startBrand, 
                                 int startRating,
                                 double startCost, 
                                 String startDestination,
                                 double startBudget ) 
    {
        super( startDestination, startBudget );
        setBrand( startBrand );
        setRating( startRating );
        setCost( startCost );
    }
    
    public void setBrand( String newBrand )
    {
        brand = newBrand;
    }
    
    public void setRating( int newRating )
    {
        rating = newRating;
    }
    
    public void setCost( double newCost )
    {
        cost = newCost;
    }
    
    public String getBrand( )
    {
        return brand;
    }
    
    public int getRating( )
    {
        return rating;
    }
    
    public double getCost( )
    {
        return cost;
    }
    
    public double overOrUnderBudget( double budget, double cost ) 
    {
        double price = budget - cost;

        return price;
    }
}
