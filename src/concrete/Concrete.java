/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author gcDataTechnology
 */
public class Concrete {
    
    public static void main(String[] args) {
        
        Employee john = new HourlyEmployee("John","111-11-1111");
        
        System.out.println(john.payEmployee());
        
    }
    
}
