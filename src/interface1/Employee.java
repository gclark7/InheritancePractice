/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author gcDataTechnology
 */
public class Employee implements Employable{
    //keeping the class employee to define base attributes
    String name;
    String qualification;
    double wage;
    double hours;
    
    //using default constructor - no definitions here
    
    
    //MUST override all abstract methods in Employable
    public String payEmployee(){
        String p="";
        return p;
    }
    
    public String roleCall(){
        String r="Base Class Employee";
        return r;
    }
    
    public void employeeRaise(double d){
        
    }
    
     public Employee promotion(Employee x){
         //not going to do anything here
         return x;
     }
    
    //base method for all employees
    public String yesMan(){
        String y="Yes";
        return y;
    }
    
    
    
    
}
