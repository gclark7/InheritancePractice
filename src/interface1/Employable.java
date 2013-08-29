/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author gcDataTechnology
 */
public interface Employable {
    //was taught the naming convention is typically "able" as these are abilities
    
    
    public abstract String payEmployee();
    public abstract String roleCall();
    public abstract void employeeRaise(double d);
    public abstract Employee promotion(Employee x);
    
}
