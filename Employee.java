
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{

    private String fastName;
    private String lastName;
    private int salary;
    
    public Employee(String fastName, String lastName, int salary){
        setFastName(fastName);
        setLastName(lastName);
        setSalary(salary);
    }
    
    public void setFastName(String fastName){
          this.fastName=fastName;  
    }
    public String getFastName(){
        return fastName;
    }
    
    public void setLastName(String lastName){
          this.lastName=lastName;  
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setSalary(int salary){
        if(salary<0){
            this.salary=0;
        }else{
          this.salary=salary;}  
    }
    public int getSalary(){
        return salary;
    }
    
    public int yearlySalary(){
        return salary*12;
    }
    
    public int raiseSalary(){
        return (salary*10/100)+salary;
    }
}
