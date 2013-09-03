/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author gcDataTechnology
 */
public class SalariedEmployee extends Employee{
    
    //constructor
    public SalariedEmployee(){//created this for subclass SalaryPlusBonus
        super();
    }
    
    public SalariedEmployee(String name, String ssNumber){
        super();//calling empty constructor
        //setting attributes from subclass constructor
        setName(name);
        setSsNumber(ssNumber);
        setPayPeriod("Bi-Weekly");
        setWage(20.0*80.0);
        setVacation(80.00);
        setHoursWorked(80.0);
                
    }
    
    
    //NOT available to mascarading instances of subclass 
     public String payEmployee(String nothing){
        String payment="You are Salary Exempt Instance, " + getName() +
                ". You earn $" + getWage() + " every 2 weeks";
        return payment;
    }
    
    //must override parent because each class is paid differently
     public String payEmployee(){
         String payment="You are Salary Exempt Employee, " + getName() +
                ". You earn $" + getWage() + " every 2 weeks";
        return payment;
     }
     
    
    
}
