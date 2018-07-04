/**
 * Non abstract subclass encapsulating a bicycle.
 *
 * Mario Montano
 * 
 */
 public class Bicycle extends Vehicle
{
 
        private String ownerName;
        private int numWheels;
 
        public Bicycle( ) 
        {
            
        }
        public Bicycle(String newName) 
        {
                ownerName = newName;
                numWheels = 2;
        }
        public String getOwnerName() 
        {
                return ownerName;
        }
        public int getNumWheels() 
        {
                return numWheels;
        }
}

