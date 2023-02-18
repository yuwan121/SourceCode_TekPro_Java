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
public class testShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape(); // membuat objek shape1
        System.out.println("shape1");
        System.out.println("color: " + shape1.getColor());
        System.out.println("filled: " + shape1.isFilled());
        System.out.println(shape1.toString());
        
        Shape shape2 = new Shape("blue", false); // membuat objek shape2
        System.out.println("\nshape2");
        System.out.println("color: " + shape2.getColor());
        System.out.println("filled: " + shape2.isFilled());
        System.out.println(shape2.toString());
        
        shape1.setColor("red"); // mengubah warna shape1 menjadi merah
        shape1.setFilled(false); // mengubah status filled shape1 menjadi false
        System.out.println("\nshape1 (after modification)");
        System.out.println("color: " + shape1.getColor());
        System.out.println("filled: " + shape1.isFilled());
    }
}
