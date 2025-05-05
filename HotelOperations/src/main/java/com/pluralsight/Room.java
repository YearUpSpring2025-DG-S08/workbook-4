package com.pluralsight;

public class Room {
    // these private variables are examples of backing variables
    private int numberOfBeds;
<<<<<<< HEAD
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
=======
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = false;

    }
    
    // the following getters are accessor methods
    // the following setters are mutator methods
>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

<<<<<<< HEAD
    public double getPrice(){
        return price;
    }
    
    public boolean isOccupied() {
        isAvailable = false;
        return isOccupied;
    }

=======
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    public boolean isDirty() {
        return isDirty;
    }

<<<<<<< HEAD
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
=======
    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    
>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
}