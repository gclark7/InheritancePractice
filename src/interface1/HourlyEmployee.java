/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author gcDataTechnology
 */
public class HourlyEmployee extends Employee implements Employable{
    
    //constructor
    public HourlyEmployee(String name, String q){
        super();
        setName(name);
        setQualification(q);
        setWage(10.00);
        setHours(40.00);
    }
    
      
    //Must be overriden
    public String payEmployee(){
        String p="";
        
        p="Weekly paycheck = $" + Double.toString(getWage()*getHours()) + ", " + getName();
        return p;
    }
    
    public String roleCall(){
        String r="I am " + getName() + ",the " + getQualification() + " and I am hourly and I am here 5 days a week.";
        return r;
    }
    
    public void administerRaise(double d){
        
    }
    
    
     public Employee promotion(Employee x){
         x=new SalariedEmployee(getName(),getQualification());
         return x;
     }
     
}
