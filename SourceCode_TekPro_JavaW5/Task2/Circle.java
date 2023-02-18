/*
 * Nama	: Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Task2;

/**
 *
 * @author BlackStyle
 */
public class Circle extends Shape {
        // private instance variable, not accessible from outside this class 
    private double radius; 
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double r, String clr, boolean fill){
        radius = r;
        super.setColor(clr);
        super.setFilled(fill);
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString(){
        return "A Circle with radius = "+ radius + ", which is a subclass of" + super.toString();
    }    
}
