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
    
    double bonus;
    
    
    //constructor
    public SalaryPlusBonusEmployee(String name, String id){
        super();
        this.name=name;
        this.empID=id;
        this.wage=3_000.00;//I was reading the primitives java doc
        //it said this was acceptable to help read numbers easier
        //is that good practice???
        this.bonus=500.00;//each month
    }
    
    //overridden abstract methods
    public String employeePaid(){
        String p="First day of the month is pay day.  $" + wage + ", " + name;
        return p;
    }
    public String roleCall(){
        String r="I am salaried plus bonus " + name + ".  ID# " + empID;
        return r;
    }
   
    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }    
    
    public double getBonus(){
        return this.bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    
    public void employeeRaise(double x){//monthly increase
        
        setWage(wage+x);
    }
    
    public void makeDeal(){
        double x = bonus+=20.00;
        setBonus(x);
        System.out.println("You've increased your bonus on that deal, " + name);
    }
}
