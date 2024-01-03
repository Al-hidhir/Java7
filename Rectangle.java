public class Rectangle
{
    private int length;
    private int width;
    
    public Rectangle(int length, int width){
        //this.length=length;
        setLength(length);
        this.width=width;
    }
    
    public int calculateArea(){
      return length*width;
    }
    
    public void setLength(int length){
        this.length=length;
    }
    
    public int getLength(){
         return length;
    }
    
    public void setWidth(int width){
        this.width=width;
    }
    
    public int getWidth(){
        return width;
    }
}
