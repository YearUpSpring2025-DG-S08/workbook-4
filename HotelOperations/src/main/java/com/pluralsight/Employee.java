package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private String employeeID;
    private String employeeName;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime = -1;

    public Employee(String employeeID, String employeeName, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
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
        if(punchInTime != -1){
            punchInTime = time;
            System.out.println("Punched in: " + time + " hours");
        } else{
            System.out.println("You are already punched in");
        }
    }
    
    public void punchOut(double time){
        if(punchInTime != -1){
            if(time > punchInTime){
                double shiftLength = time - punchInTime;
                hoursWorked += shiftLength;
                punchInTime = -1;
                System.out.println("Punched out: " + time + "hours");
                System.out.println("You worked " + hoursWorked + " hours");
            } else{
                System.out.println("Punch-out time must be after punch-in time");
            }
        } else{
            System.out.println("You must be punched in");
        }
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
