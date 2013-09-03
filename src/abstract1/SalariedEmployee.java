/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author gcDataTechnology
 */
public class SalariedEmployee extends Employee{
    
    //constructor
    public SalariedEmployee(String name, String id){
        super();
        setName(name);
        setEmpID(id);
        setWage(3_000.00);//I was reading the primitives java doc
        //it said this was acceptable to help read numbers easier
        //is that good practice???
    }
    
    //overridden abstract methods
    public String payEmployee(){
        String p="Last day of the month is pay day.  $" + getWage() + ", " + getName();
        return p;
    }
    public String roleCall(Employee x){
        String r="I am salaried " + getName() + ".  ID# " + getEmpID();
        return r;
    }
   
    //getters & setters
    
    
    public void administerRaise(double x){//monthly increase
        
        setWage(getWage()+x);
    }
    
}
