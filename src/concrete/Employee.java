/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author gcDataTechnology
 */
public class Employee {
    
    public static int employeeCount;//number of employees
    
    private String ssNumber;
    private String name;//individual and unique to each employee
    
    
    public Employee(){
        Employee.employeeCount++;
    }
    
    public Employee(String name, String ssNum){
        this.name = name;
        this.ssNumber=ssNum;
        Employee.employeeCount++;
    }
    
    
    
    
    
}
