/**
 * 
 *
 * Mario Montano
 * 
 */

public class TestVehicle 
{
        public static void main(String[] args) 
        {
            Bicycle mountain = new Bicycle("Laura");
            System.out.println("Owner = "+ mountain.getOwnerName());
            System.out.println("Wheels = "+ mountain.getNumWheels());
 
            MotorizedVehicle tesla = new MotorizedVehicle("Tracy", 4, 5.0);         
            System.out.println("Vehicle owner = " + tesla.getOwnerName());
            System.out.println("Wheels = " + tesla.getNumWheels());
            System.out.println("Engine size (litres) = " + tesla.getEvd());
            System.out.println("Horse Power = " + tesla.getHorsePower()); 
        }
}
