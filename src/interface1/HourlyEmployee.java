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
        this.name=name;
        this.qualification=q;
        this.wage=10.00;
        this.hours=40.00;
    }
    
    //getters & setters
    public String getName(){
        return name;
    }
    
    //Must be overriden
    public String payEmployee(){
        String p="";
        
        p="Weekly paycheck = $" + Double.toString(wage*hours) + ", " + name;
        return p;
    }
    
    public String roleCall(){
        String r="I am " + name + ",the " + qualification + " and I am hourly and I am here 5 days a week.";
        return r;
    }
    
    public void employeeRaise(double d){
        
    }
    
    /*
     public void promotion(Employee x){
         x=new SalariedEmployee(this.name,this.qualification);
     }
     * */
}
