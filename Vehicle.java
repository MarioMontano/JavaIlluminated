/**
 * Encapsulates a vehicle: A vehicle has two attributes: 
 * its owner’s name and its number of wheels. This class has 
 * two non abstract subclasses: one encapsulating a bicycle, 
 * and the other encapsulating a motorized vehicle.
 *
 * Mario Montano
 * 
 */
public abstract class Vehicle 
{
 
        private String ownerName;
        private int numWheels;
 
        public Vehicle() 
        {
        
        } 
        public Vehicle(String newName, int newWheels) 
        {
                ownerName = newName;
                numWheels = newWheels;
        }
}
