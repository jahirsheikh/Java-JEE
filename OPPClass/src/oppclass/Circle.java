
package oppclass;


public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double area= Math.PI*radius*radius;
        return area;
    }
    
    public double getPerimeter(){
    double perimeter= Math.PI*2*radius*radius;
    return perimeter;
    }
}
