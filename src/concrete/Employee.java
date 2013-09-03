/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author gcDataTechnology
 */
public class Employee {
    
    public static int employeeCount;//number of employees
    
    /*fields must be public or omitted to be available as a subclass variable
    **without calling super.fieldName in the sub class
    */
    
    //individual and unique to each employee
    private String ssNumber;
    private String name;
    private char gender;
    private String hireDate;
    private String endDate;
    
    //may be the same as another employee
    private String address;
    private String city;
    private String state;
    private  String zip;
    private String phone;
    
    //different by Class
    private String payPeriod;//specifies week, month, bi-weekly
    private double wage;
    private double vacation;
    private double hoursWorked;//as a salaried employee I had to punch in
    
    
    //Constructors
    public Employee(){
        Employee.employeeCount++;
        
    }
    
    public Employee(String name, String ssNum){
        this.name = name;
        this.ssNumber=ssNum;
        Employee.employeeCount++;
    }

    //Getters & Setters
    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount= employeeCount;
    }

    public String getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public double getVacation() {
        return vacation;
    }

    public void setVacation(double vacation) {
        this.vacation = vacation;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    
    

    public String[] getGender(){
        String[] g=new String[GENDER.values().length];
        int i=0;
        for(GENDER ge:GENDER.values()){
            
            g[i]=ge.toString();
            i++;
        }
        
        return g;
    }
    
     //Method 
    //- Seems that these need to be overriden in subclasses or they are not available to mascarading subclass
    //does not work overloading it - Must have same signature
    public String payEmployee(){
        String payment="BaseClass PayEmployee, " + getName();
        return payment;
    }
    
    
    enum GENDER{M,F}
    
}
