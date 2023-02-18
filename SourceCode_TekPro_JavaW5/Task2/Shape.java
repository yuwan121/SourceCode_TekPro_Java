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
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String clr, boolean fill){
        color = clr;
        filled = fill;
    }
    
    
    public String toString(){
        return "A Shape with color of " + getColor() + "and filled/Not filled";
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
}
