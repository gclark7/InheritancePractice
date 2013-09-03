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
    private double bonus;//Only salary bonus employees have a bonus
    
    
    public SalaryPlusBonusEmployee(String name, String ssNumber){
        super();
        setBonus(5000.00);
        setName(name);
        setSsNumber(ssNumber);
        setWage(80.00*20.00);//try to avoid magic numbers
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
         String payment="You are SalaryBonusEmployee, " + getName() +
                ". You earn $" + getWage() + " every 2 weeks AND recieve "
                 + "a bonus of $" + getBonus();
        return payment;
     }
     
     
}
