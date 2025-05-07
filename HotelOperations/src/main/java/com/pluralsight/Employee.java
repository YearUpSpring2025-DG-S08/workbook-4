package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;
    boolean punchedIn = false;

    public Employee(int employeeID, String name, String department, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String employeeName) {
        this.name = employeeName;
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

//    // when an employee clocks in, we track their time
//    public void punchIn(double time){
//        this.punchInTime = time;
//    }
//    
//    // when an employee clocks out, we calculate how many hours worked and add that time to hoursWorked
//    public void punchOut(double time){
//       this.hoursWorked += time - punchInTime;
//    }
    
    // create a punchTimeCard method to record punchIn and punchOut - 24hr period
    public void punchTimeCard(double time){
       if(time < 0){
           throw new IllegalArgumentException("Incorrect punch time inputted");
       } 
       
       if(punchedIn){
           this.punchInTime = time;
           System.out.println("Punched in at: " + this.punchInTime);
       } else if(time < punchInTime){
           throw new IllegalArgumentException("Punch out time cannot be earlier than Punch in time");
       }
       
       double shift = time - punchInTime;
       this.hoursWorked += shift;

        System.out.println("Punched out at: " + time );
        System.out.println("Your shift lasted: " + String.format("%.2f", hoursWorked) + " hours!");
   }
    
   // create overloaded methods for punchIn and punchOut that does not take any input
    // use LocalDateTime for current time; determine hour and minute employee clocked in/out
    public void punchIn() {
        LocalTime startTime = LocalTime.now();
        double hours = startTime.getHour();
        double minutes = startTime.getMinute() / 60f; // dividing by 60 to get a fraction of an hour
        // reason being: turning the output into a decimal for our 24hr period
        this.punchInTime = (hours + minutes);
        System.out.println("Punched in at: " + this.punchInTime);
    }

    public void punchOut() {
        LocalTime endTime = LocalTime.now();
        double hours = endTime.getHour();
        double minutes = endTime.getMinute() / 60f;
        double punchOutTime = (hours + minutes);
        this.hoursWorked = (punchOutTime - this.punchInTime);
        System.out.println("Punched out at: " + punchOutTime);
    }
    
    public void punchTimeCard(){
        LocalTime now = LocalTime.now();
        double shiftTime = now.getHour() + (now.getMinute()/60f);
        
        if(punchedIn){
            shiftTime = punchInTime;
            System.out.println("Punched in at: " + this.punchInTime);
        } else if(!punchedIn){
            System.out.println("You must be punched in!");
        }
        
        double shiftDuration = shiftTime - punchInTime;
        this.hoursWorked += shiftDuration;
        System.out.println("Punched out at: " + String.format("%.2f", shiftTime));
        System.out.println("Your shift lasted: " + String.format("%.2f", hoursWorked) + " hours!");
    }
}
