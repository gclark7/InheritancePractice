/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author gcDataTechnology
 */
public class Concrete {
    
    public static void main(String[] args) {
        
        Employee gretta = new Employee("Gretta","000-00-0000");
        System.out.println(gretta.payEmployee());
        
        //HourlyEmployee Mascarading as Parent
        //was unable to call HourlyEmployee methods without having it in the base class first.
        Employee john = new HourlyEmployee("John","111-11-1111");
        System.out.println(john.payEmployee());
        
        
        //to call subclass methods I must create a true instance of the subclass
        HourlyEmployee jill=new HourlyEmployee("Jill","222-22-2222");
        //welcomeHourlyEmployee is not available to john
        // not declared in the Employee Class
        System.out.println(jill.welcomeHourlyEmployee());
        
        System.out.println(jill.payEmployee());
        
        //SalaryEmployee mascarading
        Employee jack = new SalariedEmployee("Jack","333-33-3333");
        System.out.println(jack.payEmployee());
        
        System.out.println("This company has " + Employee.getEmployeeCount() + " employees");
    }
    
}
