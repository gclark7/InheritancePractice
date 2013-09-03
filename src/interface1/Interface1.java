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
        //now the base class Employee has implemented Employable
        //subsequent classes implement the same Interface
        //The interface forces unity between parent and child class
        
        System.out.println(howard.roleCall()); 
        System.out.println(howard.payEmployee());
        //the method is forced to be overriden due to implementation of the Interface
        //but it also forces overriding the parent method
        //and makes it available to mascarading children
        
        //because of this we are able to upgrade howard to a new employee
        //instead of creating SalariedEmployee howard1= new SalariedEmployee
        howard=new SalariedEmployee(howard.getName(),howard.getQualification());//howard is still an Employee
        System.out.println(howard.roleCall());//this is the overriden method in Salaried Employee
        
        System.out.println(howard.payEmployee());
        
        //can pass the values back in the promotion() method
        // instead of "howard=new SalaryPlusBonusEmployee(howard.name,howard.qualification);"
        howard=howard.promoteEmployee(howard);
        System.out.println(howard.roleCall());
        System.out.println(howard.payEmployee());
        //howard.changeBonus(); //not available because this is not in the base class Employee
        
        //in order to use methods like changeBonus - which are not in the base class,
        //I added the method as a sequence in an overriden method - employeeRaise
        
        howard.administerRaise(600.00);
        System.out.println("Increased bonus is reflected now. " + howard.payEmployee());
    }
}
