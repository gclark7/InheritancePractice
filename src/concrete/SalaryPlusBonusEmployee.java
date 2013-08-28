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
    
    
    
    
    
    //Getters and setters
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
