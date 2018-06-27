public class Airport
{
    private String airportCode;
    private int gates;
    
    public Airport( )
    {
        airportCode = " ";
    }
    
    public Airport( String startAirportCode, 
                    int startGates)
    {
        airportCode = startAirportCode;
        setGates( startGates );
    }
    
    public String getAirportCode( )
    {
        return airportCode;
    }
    
    public int getGates( )
    {
        return gates;
    }
    
    public void setAirportCode( String newAirportCode )
    {
        airportCode = newAirportCode;
    }
    
    public void setGates( int newGates )
    {
        if ( newGates >= 0 )
            gates = newGates;
        else
        {
            System.err.println( "Gates cannot be negative." );
            System.err.println( "Value not changed." );
        }
    
    }
}
