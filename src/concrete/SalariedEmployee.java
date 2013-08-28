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
        this.wage=20*80;
        this.vacation=80.00;
        this.hoursWorked=80.0;
                
    }
    
    
    //NOT available to mascarading subclass
     public String payEmployee(String nothing){
        String payment="Your are Salary Exempt instance, " + name +
                " You earn " + wage + " every 2 weeks";
        return payment;
    }
     
     public String payEmployee(){
         String payment="Your are Salary Exempt Employee, " + name +
                " You earn " + wage + " every 2 weeks";
        return payment;
     }
     
    
    
}
