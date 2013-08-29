/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author gcDataTechnology
 */
public class SalariedEmployee extends Employee implements Employable{
    
    //constructors
    //keeping a default for subclass to use
    public SalariedEmployee(){
        
    }
    
    public SalariedEmployee(String name, String q){
        super();
        this.name=name;
        this.qualification=q;
        //new wage, new hours
        this.wage=18.00 * 90.00;
        this.hours=45.00;
        
    }
     //Must be overriden
    public String payEmployee(){
        String p="You are paid Biweekly: $" + wage;
        return p;
    }
    
    public String roleCall(){
        String r="I'm still an Employee, But now I'm Salaried!!";
                
        return r;
    }
    
    public void employeeRaise(double d){
        
    }
    
     public Employee promotion(Employee x){
        
         x=new SalaryPlusBonusEmployee(this.name,this.qualification);
         return x;
         
          //SalaryPlusBonusEmployee y = new SalaryPlusBonusEmployee(x.name,x.qualification);
         //return y;
         //does not work as anticipated,  I was hoping to make Employee howard a true instance of SPBEmployee
         //perhaps it does, but the driver does not recognize it and causes runtime exceptions when I try howard.changeBonus()
     }
    
}
