
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
  private int month;
  private int day;
  private int year;
  
  public Date(int month, int day, int year){
      setMonth(month); 
      setDay(day);
      setYear(year);
}
  
   public void setMonth(int month){
        if(month>=1 && month<12){
            this.month=month;
        }else{this.month=1;}
    }
   public int getMonth(){
        return month;
   }
    
   public void setDay(int day){
        this.day=day;
   }
   public int getDay(){
        return day;
   }
   
   public void setYear(int year){
        this.year=year;
   }
   public int getYear(){
        return year;
   }
   
   public void showDate(){
        System.out.println(month+"/"+day+"/"+year);
    }
}
