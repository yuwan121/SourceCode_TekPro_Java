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
public class Rectangle extends Shape{
    private double width,length;
    
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length,String color, boolean filled){
        this.width = width;
        this.length = length;
        super.setColor(color);
        super.setFilled(filled);
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (2*width)+(2*length);
    }
    
    @Override
    public String toString(){
        return "A Rectangle with width = "+ width + "and length = " + length + ",which  is  a  subclass  of" + super.toString();
    }
}
