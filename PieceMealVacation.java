/**
 * A piecemeal vacation has two additional attributes: a set of items 
 * (hotel, meal, airfare, …), and a set of corresponding costs.
 *
 * Mario Montano
 * 
 */
import java.util.ArrayList;
import java.text.DecimalFormat;

public class PieceMealVacation extends Vacation
{   
    private String hotel;
    private String meal;
    private String airfare;
    private double hotelCost;
    private double mealCost;
    private double airfareCost;
    
    public PieceMealVacation( )
    {
        super( );
        hotel = "unknown";
        meal = "unknown";
        airfare = "unknown";
        hotelCost = 0.00;
        mealCost = 0.00;
        airfareCost = 0.00;
    }
       
    public PieceMealVacation( String startDestination,
                              double startBudget,
                              String startHotel,
                              String startMeal,
                              String startAirfare,
                              double startHotelCost,
                              double startMealCost,
                              double startAirfareCost )
    {
        super( startDestination, startBudget );
        setHotel( startHotel );
        setMeal( startMeal );
        setAirfare( startAirfare );
        setHotelCost( startHotelCost );
        setMealCost( startMealCost );
        setAirfareCost( startAirfareCost );
    }
    
    public void setHotel( String newHotel )
    {
        hotel = newHotel;
    }
    
    public String getHotel( )
    {
        return hotel;
    }
    
    public void setMeal( String newMeal )
    {
        meal = newMeal;
    }
    
    public String getMeal( )
    {
        return meal;
    }
    
    public void setAirfare( String newAirfare )
    {
        airfare = newAirfare;
    }
    
    public String getAirfare( )
    {
        return airfare;
    }
    
    public void setHotelCost( double newHotelCost )
    {
        hotelCost = newHotelCost;
    }
    
    public double getHotelCost( )
    {
        return hotelCost;
    }
    
    public void setMealCost( double newMealCost )
    {
        mealCost = newMealCost;
    }
    
    public double getMealCost( )
    {
        return mealCost;
    }
    
    public void setAirfareCost( double newAirfareCost )
    {
        airfareCost = newAirfareCost;
    }
    
    public double getAirfareCost( )
    {
        return airfareCost;
    }
    
    public String toString( )
    {
        DecimalFormat dollarsFormat = new DecimalFormat( "$###,###,###,###.00" );
        return "Hotel: " + hotel
               + "; meal: " + meal
               + "; airfare: " + airfare
               + "; hotel cost: " 
               + dollarsFormat.format( hotelCost )
               + "; meal cost: " 
               + dollarsFormat.format( mealCost )
               + "; airfare cost: " 
               + dollarsFormat.format( airfareCost );
    }
    
    public boolean equals( Object o )
    {
        if ( ! ( o instanceof PieceMealVacation ) )
            return false;
        else
        {
            PieceMealVacation objPieceMealVacation = ( PieceMealVacation ) o;
            if ( hotel.equals( objPieceMealVacation.hotel )
                && meal.equals( objPieceMealVacation.meal )
                && airfare.equals( objPieceMealVacation.airfare )
                && hotelCost == objPieceMealVacation.hotelCost
                && mealCost == objPieceMealVacation.mealCost
                && airfareCost == objPieceMealVacation.airfareCost )
                    return true;
            else
                    return false;
        }
    }
    
    double cost = hotelCost + mealCost + airfareCost;
    public double overOrUnderBudget( double budget, 
                                     double cost ) 
    {
        double result = budget - cost;

        return result;
    }
}
