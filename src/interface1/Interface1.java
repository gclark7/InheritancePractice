/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author gcDataTechnology
 */
public class Interface1 {
    
    public static void main(String[] args) {
        
        Employee howard=new HourlyEmployee("Howard","Accountant");
        //now this works because it must be in the base class as well as subclass
        //The interface forces unity between parent and child class
        System.out.println(howard.roleCall()); 
        System.out.println(howard.payEmployee());
        //the method is forced to be overriden due to implementation of the Interface
        //but it also forces overriding the parent method
        
        //because of this we are able to upgrade howard to a new employee
        howard=new SalariedEmployee(howard.name,howard.qualification);
        System.out.println(howard.roleCall());
        
        System.out.println(howard.payEmployee());
        //howard.changeBonus(); //not available because this is not in the base class Employee
        
        
        howard=new SalaryPlusBonusEmployee(howard.name,howard.qualification);
        System.out.println(howard.roleCall());
        System.out.println(howard.payEmployee());
        
    }
}
