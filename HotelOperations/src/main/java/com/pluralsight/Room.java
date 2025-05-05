package com.pluralsight;

public class Room {
    // these private variables are examples of backing variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;
    private String checkIn;
    private boolean checkout;
    private boolean cleanroom;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable, String checkIn, boolean checkout, boolean cleanroom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = false;
        this.checkIn = checkIn;
        this.checkout = false;
        this.cleanroom = false;
    }
    
    // the following getters are accessor methods
    // setters are mutator methods
    // removed the setters because we do not want users to be able to change the data
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice(){
        return price;
    }
    
    public boolean isOccupied() {
        isAvailable = false;
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    
    public String checkIn(){
        isOccupied = true;
        isDirty = true;
        isAvailable = false;
        return checkIn;
    }
    
    public boolean checkout(){
        isOccupied = false;
        return checkout;
    }
    
    public boolean isCleanroom(){
        isAvailable = true;
        isDirty = false;
        return cleanroom;
    }
}