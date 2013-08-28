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

     //different by Class
    String payPeriod="Weekly";
    double wage=7.75;
    double vacation=40.00;
    double bonus=0.00;//any employee can get a bonus, some are contracted
    final double EXPECTED_HOURS=40.0;
    double hoursWorked=40.0;
    
    //Constructors
    public HourlyEmployee(String name, String ssNum) {
        super(name, ssNum);
        
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
    
    //Method
    public String getPaid(){
        String paid="";
        double hrs=0.00;
        
        if(hoursWorked>EXPECTED_HOURS){
            hrs=hoursWorked*wage;//standard wage
            hrs+=(hoursWorked - EXPECTED_HOURS)*(wage/2);//calculate overtime
        }else{
            hrs=hoursWorked*wage;//standard wage
        }
            hrs+=bonus;
            
        paid= ",You've worked " + Double.toString(hoursWorked) + " earning $" + hrs; 
        return paid;
    }
    
}
