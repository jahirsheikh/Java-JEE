
package transport;


public class Car extends Vehicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    
    
    
    
   

    @Override
    public void detalis() {
        super.detalis(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start() {
        
        System.out.println("Car Start");
    }

    @Override
    public void stopt() {
        System.out.println("Car stop ");    }
    
    
    
}
