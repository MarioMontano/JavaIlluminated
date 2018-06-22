/**
 * Encapsulates the concept of the weather forecast.
 *
 * Mario Montano
 * 
 */


public class Weather
{
    
    private String skyConditions;
    private int temperature;
    
    public Weather( )
    {
        skyConditions = "sunny";
        temperature = 70;
    }
    
    public Weather(String startSkyConditions,
                   int startTemperature)
    {
        skyConditions = startSkyConditions;
        setTemperature(startTemperature);
    }
    
    public String getSkyConditions( )
    {
        return skyConditions;
    }
    
    public int getTemperature( )
    {
        return temperature;
    }
    
    public void setSkyConditions(String newSkyConditions)
    {
        if (newSkyConditions == "sunny" || 
            newSkyConditions == "snowy" || 
            newSkyConditions =="cloudy" || 
            newSkyConditions =="rainy")
            skyConditions = newSkyConditions;
        else
        {
            System.err.println("Sky conditions must be sunny, snowy, cloudy, or rainy.");
            System.err.println("Value not changed.");
        }
    }
    
    public void setTemperature(int newTemperature)
    {
        if (newTemperature > -50 && newTemperature < 150)
            temperature = newTemperature;
        else
        {
            System.err.println("Temperature cannot be less than -49 or greater than 149.");
            System.err.println("Value not changed.");
        }
    }    
    
    public double convertFahrenheitToCelsius( )
    {
        return (temperature-32)*5/9;
    }
    
    public String toString( )
    {
        return "sky conditions: " + skyConditions
                + "; temperature: " + temperature;
    }
    
    public boolean equals(Object o)
    {
        if(!(o instanceof Weather))
            return false;
        else
        {
            Weather objWeather = (Weather) o;
            if (skyConditions.equals(objWeather.skyConditions)
                && temperature == objWeather.temperature)
                    return true;
            else
                    return false;
        }
    }
    
    public boolean consistent( )
    {
        if((temperature < 32 && !(skyConditions == "snowy"))
            || ((temperature > 100) && (!(skyConditions == "sunny"))))
            return false;
        else
        {
            return true;
        }        
    }
}
