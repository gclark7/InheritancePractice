/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author gcDataTechnology
 */
public class HourlyEmployee extends Employee{

    //specific to hourly - calculates overtime    
    final double EXPECTED_HOURS=40.0;
    
    
    //Constructors
    public HourlyEmployee(String name, String ssNum) {
        super(name, ssNum);
        //initial values for hourly employee
        payPeriod="Weekly";
        wage=7.75;
        vacation=40.00;
        hoursWorked=40.0;
    }
    
    
    
    //Getters&Setters
    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getVacation() {
        return vacation;
    }

    public void setVacation(double vacation) {
        this.vacation = vacation;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
   public String payEmployee(){ 
        String paid="";
        double hrs=0.00;
        
        if(hoursWorked>EXPECTED_HOURS){
            hrs=hoursWorked*wage;//standard wage
            hrs+=(hoursWorked - EXPECTED_HOURS)*(wage/2);//calculate overtime
        }else{
            hrs=hoursWorked*wage;//standard wage
        }
           
            
        paid= name + ",You've worked " + Double.toString(hoursWorked) + "hours, earning $" + hrs; 
        return paid;
   }
    
}
