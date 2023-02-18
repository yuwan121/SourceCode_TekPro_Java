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
public class Square extends Rectangle {
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side,side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    
    public double getSide(){
        return super.getLength(); //Atau boleh juga super.getWidth, karena nilainya sama saja,
                                  //di method setSide sudah disamakan nilainya atau di constructornya
    }
    
    public void setSide(double side){
        super.setLength(side); 
        super.setWidth(side);
    }
    
    @Override
    public String toString(){
        return "A Square with side = " + getSide() + ", which is a subclass of" + super.toString();
    }    
    
    @Override
    public double getArea(){
        return getSide()*getSide();
    }
    
    @Override
    public double getPerimeter(){
        return 4*getSide();
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
}