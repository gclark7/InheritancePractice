/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author gcDataTechnology
 */
public abstract class Employee {
    
    static int employees;
    String name;
    String empID;
    double wage;
    
    //constructor - even though an abstract class cannot be instantiated
    public Employee(){
        //it will be called in the child classes just before there are instantiated
        employees++;
    }
    
    
    //Abstract classes can have a mix of abstract methods and fully implemented methods
    public String areYouAvailable(){
        String response="Yes";
        return response;
    }
    
    //subclasses must override all abstract methods in parent class
    public abstract String employeePaid();//no body - each class determines how to use it
    public abstract String roleCall(Employee x);
    public abstract void employeeRaise(double x);
    
    //Getter for Employee Class
    public int getEmployeeCount(){
        return employees;
    }
    
    public String getEmployeeType(Employee x){
        String e=x.name + " is " + x.getClass();
        return e;
    }
}
