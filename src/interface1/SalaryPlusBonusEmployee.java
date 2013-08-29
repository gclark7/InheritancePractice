/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author gcDataTechnology
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee implements Employable{
    
    double bonus=500.00;//only applies to bonus employees
    
    //constructor
    public SalaryPlusBonusEmployee(String name, String q){
        this.name=name;
        this.qualification=q;
        this.hours=220;
        this.wage=22.00*hours;
    }
    
     //Must be overriden
    public String payEmployee(){
        String p="Monthly Wage plus Bonus =$" + (wage+bonus);
        return p;
    }
    
    public String roleCall(){
        String r="You are a Salary Bonus employee, " + name;
        return r;
    }
    
    public void employeeRaise(double d){
        
    }
    
     public Employee promotion(Employee x){
         //not doing anyting here, no more advances available
         return x;
     }
     
    public void changeBonus(double x){
        this.bonus+=x;
    }
}
