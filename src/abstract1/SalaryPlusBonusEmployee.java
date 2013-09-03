/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author gcDataTechnology
 */
public class SalaryPlusBonusEmployee extends Employee{
    
    private double bonus;
    
    
    //constructor
    public SalaryPlusBonusEmployee(String name, String id){
        super();
        setName(name);
        setEmpID(id);
        setWage(3_000.00);//I was reading the primitives java doc
        //it said this was acceptable to help read numbers easier
        //is that good practice???
    }
    
    //overridden abstract methods
    public String payEmployee(){
        String p="First day of the month is pay day.  $" + (getWage()+getBonus()) + ", " + getName();
        return p;
    }
    public String roleCall(Employee x){
        String r="I am salaried plus bonus " + getName() + ".  ID# " + getEmpID();
        return r;
    }
   
    //getters & setters
    
    
    public double getBonus(){
        return this.bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    
    public void administerRaise(double x){//monthly increase
        
        setWage(getWage()+x);
    }
    
    public void makeDeal(){
        double x = bonus+=20.00;
        setBonus(x);
        System.out.println("You've increased your bonus on that deal, " + getName());
    }
}
