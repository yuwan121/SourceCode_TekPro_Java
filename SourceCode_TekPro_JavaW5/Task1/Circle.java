/*
 * Nama	: Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Task1;

/**
 *
 * @author BlackStyle
 */
/** * The Circle class models a circle with a radius and color. */
public class Circle {   // Save as "Circle.java"
    // private instance variable, not accessible from outside this class 
    private double radius; 
    private String color;
    
    // Constructors (overloaded)
/** Constructs a Circle instance with default value for radius and color */ 
    public Circle() {	// 1st (default) constructor
        radius = 1.0; color = "red";
    }

/** Constructs a Circle instance with the given radius and default color
     * @param r */ 
    public Circle(double r) {	// 2nd constructor
        radius = r; color = "red";
    }

/** Constructs a Circle instance with the given radius and given colo
     * @param r
     * @param clr*/
    public Circle(double r, String clr){
       radius = r;
       color = clr;
    }

/** Returns the radius
     * @return  */ 
    public double getRadius() {
        return radius;
    }

/** Returns the area of this Circle instance
     * @return  */ 
    public double getArea() {
        return radius*radius*Math.PI;
    }

/**	Return	a	self-descriptive	string	of	this	instance	in	the	form	of Circle[radius=?,color=?]
     * @return  */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}

   
