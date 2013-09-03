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
    private String name;
    private String qualification;
    private double wage;
    private double hours;
    
    //using default constructor - no definitions here
    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    
    
    //MUST override all abstract methods in Employable
    public String payEmployee(){
        String p="";
        return p;
    }
    
    public String roleCall(){
        String r="Base Class Employee";
        return r;
    }
    
    public void administerRaise(double d){
        
    }
    
     public Employee promoteEmployee(Employee x){
         //not going to do anything here
         return x;
     }
    
    //base method for all employees
    public String yesMan(){
        String y="Yes";
        return y;
    }
    
    
    
    
}
