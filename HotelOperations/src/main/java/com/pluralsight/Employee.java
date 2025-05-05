package com.pluralsight;

import java.time.LocalTime;

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

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

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
    }
}
