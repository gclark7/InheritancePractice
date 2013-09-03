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
        setName(name);
        setQualification(q);
         //new wage, new hours
        setWage(18.00*90.00);
        setHours(45.00);
       
    }
     //Must be overriden
    public String payEmployee(){
        String p="You are paid Biweekly: $" + getWage();
        return p;
    }
    
    public String roleCall(){
        String r="I'm still an Employee, But now I'm Salaried!!";
                
        return r;
    }
    
    public void administerRaise(double d){
        
    }
    
     public Employee promoteEmployee(Employee x){
        
         x=new SalaryPlusBonusEmployee(getName(),getQualification());
         return x;
         
          //SalaryPlusBonusEmployee y = new SalaryPlusBonusEmployee(x.name,x.qualification);
         //return y;
         //does not work as anticipated,  I was hoping to make Employee howard a true instance of SPBEmployee
         //perhaps it does, but the driver does not recognize it and causes runtime exceptions when I try howard.changeBonus()
     }
    
}
