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
        this.name=name;
        this.ssNumber=ssNumber;
        this.payPeriod="Bi-Weekly";
        this.wage=20.0*80.0;
        this.vacation=80.00;
        this.hoursWorked=80.0;
                
    }
    
    
    //NOT available to mascarading instances of subclass 
     public String payEmployee(String nothing){
        String payment="You are Salary Exempt Instance, " + name +
                ". You earn $" + wage + " every 2 weeks";
        return payment;
    }
    
    //must override parent because each class is paid differently
     public String payEmployee(){
         String payment="You are Salary Exempt Employee, " + name +
                ". You earn $" + wage + " every 2 weeks";
        return payment;
     }
     
    
    
}
