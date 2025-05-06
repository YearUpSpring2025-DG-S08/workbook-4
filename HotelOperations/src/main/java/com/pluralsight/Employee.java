package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(int employeeID, String employeeName, String department, double payRate) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    double totalPay() {
        return (regularHours() * payRate) + (overtimeHours() * payRate * 1.5);
    }

    double regularHours() {
        return Math.min(hoursWorked, 40);
    }

    double overtimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    
    public void punchIn(double time){
        this.punchInTime = time;
    }
    
    public void punchOut(double time){
       this.hoursWorked += time - punchInTime;
    }
    
    public void punchTimeCard() {
        
    }
    
    public LocalTime punchIn() {
        LocalTime startTime = LocalTime.now();
        return startTime;
    }

    public LocalTime punchOut() {
        LocalTime endTime = LocalTime.now();
        return endTime;
    }
}
