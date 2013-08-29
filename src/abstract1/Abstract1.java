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
        System.out.println(darleen.employeePaid());
        //darleen.envyEmployee(); still has no access to HourlyEmployee Methods
        
        HourlyEmployee kim= new HourlyEmployee("Kim","0852");
        System.out.println(kim.roleCall(kim));
        
        SalariedEmployee tim=new SalariedEmployee("Tim","1789");
        System.out.println(tim.roleCall(tim));
        
        SalaryPlusBonusEmployee rob = new SalaryPlusBonusEmployee("Rob","4567");
        System.out.println(rob.roleCall(rob));
        System.out.println(rob.employeePaid());
        rob.makeDeal();
        System.out.println(rob.employeePaid());
        
        
    }
}
