/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author gcDataTechnology
 */
public class Abstract1 {
    
    
    public static void main(String[] args) {
        
        Employee darleen =new HourlyEmployee("Darleene", "0175");
        
        System.out.println(darleen.getEmployeeType(darleen));
        
        //darleen.envyEmployee(); still has no access to HourlyEmployee Methods
        
        
        
    }
}
