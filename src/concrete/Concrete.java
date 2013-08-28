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
        
        //HourlyEmployee Mascarading as Parent
        //was unable to call HourlyEmployee methods without having it in the base class first.
        Employee john = new HourlyEmployee("John","111-11-1111");
        System.out.println(john.payEmployee());
        
        //to call subclass methods I must create a true instance of the subclass
        HourlyEmployee jill=new HourlyEmployee("Jill","222-22-2222");
        System.out.println(jill.welcomeHourlyEmployee());
        //welcomeHourlyEmployee is not available to john *** not flexible
        
        //SalaryEmployee mascarading
        Employee jack = new SalariedEmployee("Jack","333-33-3333");
        jack.payEmployee();//not souting...8-28-2013
        
        
    }
    
}
