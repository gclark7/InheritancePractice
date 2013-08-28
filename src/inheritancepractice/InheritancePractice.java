/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author gcDataTechnology
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        concrete.Employee john = new concrete.HourlyEmployee("John","111-11-1111");
        
        john.payEmployee();
    }
}
