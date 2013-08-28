/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author gcDataTechnology
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    double bonus;//Only salary bonus employees have a bonus
    
    
    public SalaryPlusBonusEmployee(String name, String ssNumber){
        super();
        bonus=5000.00;
        this.name=name;
        this.ssNumber=ssNumber;
        this.wage=80.00*20.00;//try to avoid magic numbers
    }
    
    
    //Getters and setters
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
     //must override parent because each class is paid differently
     public String payEmployee(){
         String payment="You are SalaryBonusEmployee, " + name +
                ". You earn $" + wage + " every 2 weeks AND recieve "
                 + "a bonus of $" + bonus;
        return payment;
     }
     
     
}
