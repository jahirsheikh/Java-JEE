
package transport;


public class MotorCycle extends Vehicle{

    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    
    
    
    

    
    @Override
    public void detalis() {
        super.detalis(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start() {
System.out.println("Motor cycle Start ");    }

    @Override
    public void stopt() {
System.out.println("Motor cycle stop ");    }
    
    
    
}
