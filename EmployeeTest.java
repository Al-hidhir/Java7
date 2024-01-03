
/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
   public static void main(String[]args){
        Employee emp1=new Employee("Jazira","Lumwesa",520000);
        
        System.out.println(emp1.getFastName()+" "+emp1.getLastName());
        System.out.println("Salary: "+ emp1.getSalary());
        System.out.println("Yearly Salary: "+emp1.yearlySalary());
        
        emp1.setFastName("Venant");
        emp1.setLastName("Luoga");
        emp1.setSalary(390000);
        
        System.out.println(emp1.getFastName()+" "+emp1.getLastName());
        System.out.println("Salary: "+ emp1.getSalary());
        System.out.println("Yearly Salary: "+emp1.yearlySalary());
    }
}
