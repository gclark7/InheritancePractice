/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author gcDataTechnology
 */
public class HourlyEmployee extends Employee implements Employable{
    
    
    //Must be overriden
    public String payEmployee(){
        String p="";
        return p;
    }
    
    public String roleCall(){
        String r="";
        return r;
    }
    
    public void employeeRaise(double d){
        
    }
}
