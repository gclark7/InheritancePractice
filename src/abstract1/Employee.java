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
    
    public static int employees;
    private String name;
    private String empID;
    private double wage;
    
    //constructor - even though an abstract class cannot be instantiated
    public Employee(){
        //it will be called in the child classes just before there are instantiated
        employees++;
    }
    
    
    //Abstract classes can have a mix of abstract methods and fully implemented methods
    public String areYouAvailable(){//cute method that ensures the Employee is a "yes man"
        String response="Yes";
        return response;
    }
    
    //subclasses must override all abstract methods in parent class
    public abstract String payEmployee();//no body - each class determines how to use it
    public abstract String roleCall(Employee x);
    public abstract void administerRaise(double x);
    
    //Getter for Employee Class
    public int getEmployeeCount(){
        return employees;
    }
    
    public String getEmployeeType(Employee x){
        String e=x.name + " is " + x.getClass();
        return e;
    }

    public static int getEmployees() {
        return employees;
    }

    public static void setEmployees(int employees) {
        Employee.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    
    
}
