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
    
    private double bonus=500.00;//only applies to bonus employees
    
    //constructor
    public SalaryPlusBonusEmployee(String name, String q){
        setName(name);
        setQualification(q);
        setHours(220);
        setWage(22.00*getHours());
    }
    
     //Must be overriden
    public String payEmployee(){
        String p="Monthly Wage plus Bonus =$" + (getWage()+getBonus());
        return p;
    }
    
    public String roleCall(){
        String r="You are a Salary Bonus employee, " + getName();
        return r;
    }
    
    public void administerRaise(double d){
        setBonus(d);
    }
    
     public Employee promoteEmployee(Employee x){
         //not doing anyting here, no more advances available
         return x;
     }
     
    public void setBonus(double x){
        this.bonus+=x;
    }
    
    public double getBonus(){
        return bonus;
    }
}
