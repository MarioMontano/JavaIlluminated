/**
 * Non abstract subclass encapsulating a motorized vehicle. A motorized 
 * vehicle has the following additional attributes: its engine 
 * volume displacement, in liters; and a method computing and returning 
 * a measure of horsepower—the number of liters times the number of wheels.
 *
 * Mario Montano
 * 
 */
public class MotorizedVehicle extends Vehicle 
{
 
        private String ownerName;       
        private int numWheels;          
        private double evd;      
 
        public MotorizedVehicle( ) 
        {
        
        }
        public MotorizedVehicle(String newName, int newWheels, double newEvd) 
        {
                ownerName = newName;
                numWheels = newWheels;
                evd = newEvd;
        }
        public String getOwnerName() 
        {
                return ownerName;
        }
        public int getNumWheels() 
        {
                return numWheels;
        }
        public double getEvd() 
        {
                return evd;
        } 
        public double getHorsePower() 
        {
                return ( evd * numWheels );
        }
}
