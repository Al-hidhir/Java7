
/**
 * Write a description of class InvoiceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InvoiceTest
{
   public static void main(String[]args){
    Invoice invoice1=new Invoice(3,"large",23,40);
    
    System.out.println("Part Number is ;"+invoice1.getPartnumber());
    System.out.println("Description is ;"+invoice1.getParDescription());
    System.out.println("invoice1 is ;"+invoice1.InvoiceAmount());
    
    invoice1.setPartNumber(5);
    invoice1.setPartDescription("Small");
    
    System.out.println("Part Number is ;"+invoice1.getPartnumber());
    System.out.println("Description is ;"+invoice1.getParDescription());
    System.out.println("invoice1 is ;"+invoice1.InvoiceAmount());
    
    invoice1.setQuantity(-5);
    invoice1.setPartDescription("Small");
    
    System.out.println("Negative;"+invoice1.getQuantity());
    }
}
