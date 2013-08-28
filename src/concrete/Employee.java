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
    private String zip;
    private String phone;
    
   
    
    
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

    public GENDER[] getGender(){
        GENDER[] g=GENDER.values();
        
        return g;
    }
    
    enum GENDER{M,F}
    
}
