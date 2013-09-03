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
   private double hours=40;
   
    //constructor
    public HourlyEmployee(String name, String id){
        super();
        this.setName(name);
        setEmpID(id);
        setWage(15.00);
    }
    
    //overridden
    public String payEmployee(){
        String p="HourlyEmployees are paid wage*hours $" + (getWage()*hours) + " each week, " + getName() ;
        return p;
    }
    public String roleCall(Employee x){
        String r="My name is " +getName() + ".  ";
        r+=getEmployeeType(x);
        return r;
    }
    
     public void administerRaise(double percent){
        double y=getWage()*(1+percent);
        
        setWage(y);//could have done: wage=wage*(1+percent);
    }
    
     
   
    //methods
   public String envyEmployee(){
       String e="I wish I were SalariedEmployee";
       return e;
   }
    
}
