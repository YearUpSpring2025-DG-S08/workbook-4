package com.pluralsight;

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

    public void setEmployeeID(String employeeID) {
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

    double getOvertimeHours(double payRate, double hoursWorked) {
        // calculate gross pay
        // calculate how to pay 1.5x for overtime after 40hrs
        return (hoursWorked > 40) ? (40 * payRate) + ((payRate * 1.5) * (hoursWorked - 40)): hoursWorked * payRate;
    }
}
