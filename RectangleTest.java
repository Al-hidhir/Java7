
/**
 * Write a description of class RectangleTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleTest
{
   public static void main(String[]args){
        Rectangle rec1 = new Rectangle(5,8);
        
        System.out.println("The area of ractangle 1: "+rec1.calculateArea());
        
        rec1.setLength(3);
        rec1.setWidth(8);
        
        System.out.println("Length :"+rec1.getLength());
        System.out.println("Widht :"+rec1.getWidth());
        System.out.println("The area of ractangle 2: "+rec1.calculateArea());
    }
}
