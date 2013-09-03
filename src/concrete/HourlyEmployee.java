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
    private final double EXPECTED_HOURS=40.0;
    
    
    //Constructors
    public HourlyEmployee(String name, String ssNum) {
        super(name, ssNum);
        //initial values for hourly employee
        setPayPeriod("Weekly");
        setWage(7.75);
        setVacation(40.00);
        setHoursWorked(40.0);
    }
    
    
    
    //Getters&Setters
    
   public double getEXPECTED_HOURS(){ 
        return EXPECTED_HOURS;
   }
    
   public String payEmployee(){ 
        String paid="";
        double hrs=0.00;
        
        if(getHoursWorked()>getEXPECTED_HOURS()){
            hrs=getHoursWorked()*getWage();//standard wage
            hrs+=(getHoursWorked() - EXPECTED_HOURS)*(getWage()/2);//calculate overtime
        }else{
            hrs=getHoursWorked()*getWage();//standard wage
        }
           
            
        paid= getName() + ",You've worked " + Double.toString(getHoursWorked()) + "hours, earning $" + hrs; 
        return paid;
   }
   
   //calling this subclass from true HourlyEmployee instance
   public String welcomeHourlyEmployee(){
       String s="This is called from an instance of HourlyEmployee, " + getName();
       return s;
   }
    
}
