/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author gcDataTechnology
 */
public class HourlyEmployee extends Employee{
    
    //fields specific to HourlyEmployee
    //in this example hours worked only matters for this class
   double hours=40;
   
    //constructor
    public HourlyEmployee(String name, String id){
        super();
        this.name=name;
        this.empID=id;
        this.wage=15.00;
    }
    
    
    public String employeePaid(){
        String p="HourlyEmployees are paid $" + (wage*hours) + " each week, " + name ;
        return p;
    }
    public String roleCall(){
        String r="My name is " +name;
        return r;
    }
    
    //getters & setters - super
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
    
    //methods
    public void employeeRaise(double percent){
        double y=wage*(1+percent);
        
        setWage(y);//could have done: wage=wage*(1+percent);
    }
    
}
