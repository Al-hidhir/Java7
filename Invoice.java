
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
   
    private int PartNumber;
    private String PartDescription;
    private int Quantity;
    private int pricePerItem;
    
    public Invoice(int PartNumber,String PartDescription,int Quantity,int pricePerItem){
   /* this.PartNumber=PartNumber;
    this.PartDescription=PartDescription;
    this.Quantity=Quantity;
    this.pricePerItem=pricePerItem;*/
    setPartNumber(PartNumber);
    setPartDescription(PartDescription);
    setQuantity(Quantity);
    setpricePerItem(pricePerItem);
    
    }
    public int InvoiceAmount(){
    return Quantity*pricePerItem;
    }
    
    public void setPartNumber(int PartNumber){
    this.PartNumber=PartNumber;
    }public int getPartnumber(){
    return PartNumber;
    }
    
    
    
    public void setPartDescription(String PartDescription){
    this.PartDescription=PartDescription;
    }public String getParDescription(){
    return PartDescription;
    }
    
    
    public void setQuantity(int Quantity){
        if(Quantity<0){
            this.Quantity=0;
        }else{
            this.Quantity=Quantity;
        }
    }public int getQuantity(){
    return Quantity;
    }
    
    
    public void setpricePerItem(int pricePerItem){
        if(pricePerItem<0){
            this.pricePerItem=0;
        }else{
        this.pricePerItem=pricePerItem;
        }
    this.pricePerItem=pricePerItem;
    }public int getpricePerItem(){
    return pricePerItem;
    }
    
    
    
    

    
}
