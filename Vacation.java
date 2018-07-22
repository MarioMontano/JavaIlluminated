/**
 * Write an abstract superclass encapsulating a vacation: A vacation has two attributes: 
 * a budget and a destination. It has an abstract method returning by how much the 
 * vacation is over or under budget.
 *
 * Mario Montano
 * 
 */
public abstract class Vacation
{
    private double budget;
    private String destination;
    
    public Vacation( )
    {
        destination = "unknown";
    }
    
    public Vacation( String startDestination,
                     double startBudget )
    {
        destination = startDestination;
        
        if ( startBudget >= 0.00 )
            budget = startBudget;
        else
        {
            System.err.println( "Budget is negative." );
            System.err.println( "Value is set to 0.00" );
        }
    }
    
    public double getBudget( )
    {
        return budget;
    }
    
    public void setBudget( double newBudget )
    {
        budget = newBudget;
    }
    
    public String getDestination( )
    {
        return destination;
    }
    
    public void setDestination( String newDestination )
    {
        destination = newDestination;
    }
    
    public abstract double overOrUnderBudget( double budget, double price );
    
}
