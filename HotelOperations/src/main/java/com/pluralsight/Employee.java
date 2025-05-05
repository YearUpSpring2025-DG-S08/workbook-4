package com.pluralsight;

<<<<<<< HEAD
import java.time.LocalTime;

=======
>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
public class Employee {
    private String employeeID;
    private String employeeName;
    private String department;
    private double payRate;
    private double hoursWorked;
    
    public Employee(String employeeID, String employeeName, String department, double payRate, double hoursWorked){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeID() {
        return employeeID;
    }

<<<<<<< HEAD
=======
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    public String getEmployeeName() {
        return employeeName;
    }

<<<<<<< HEAD
=======
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    public String getDepartment() {
        return department;
    }

<<<<<<< HEAD
=======
    public void setDepartment(String department) {
        this.department = department;
    }

>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    public double getPayRate() {
        return payRate;
    }

<<<<<<< HEAD
=======
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    public double getHoursWorked() {
        return hoursWorked;
    }

<<<<<<< HEAD
    double totalPay(){
        return hoursWorked * payRate;
    }
    
    double regularHours(double hoursWorked){
       return Math.min(hoursWorked, 40);
    }
    
    double getOvertimeHours(double payRate, double hoursWorked) {
       return Math.max(hoursWorked - 40, 0);
    }
    
    public LocalTime punchIn(){
        LocalTime startTime = LocalTime.now();
        return startTime;
    }
    
    public LocalTime punchOut(){
        LocalTime endTime = LocalTime.now();
        return endTime;
    }
    
    public double punchTimeCard(){
        return 0;
=======
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    double getOvertimeHours(double payRate, double hoursWorked) {
        // calculate gross pay
        // calculate how to pay 1.5x for overtime after 40hrs
        return (hoursWorked > 40) ? (40 * payRate) + ((payRate * 1.5) * (hoursWorked - 40)): hoursWorked * payRate;
>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    }
}
