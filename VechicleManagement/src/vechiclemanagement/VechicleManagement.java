
package vechiclemanagement;

import transport.Car;
import transport.MotorCycle;
import transport.Vehicle;


public class VechicleManagement {

   
    public static void main(String[] args) {
        
        Vehicle car = new Car("L-2532", "BMW", 20);
        Vehicle motorcycle = new MotorCycle("Dhaka", "TVS", 11);
        
        car.start();
        car.stopt();
        car.detalis();
        
        
        motorcycle.start();
        motorcycle.stopt();
        motorcycle.detalis();
       
    }
    
}
