package com.pluralsight;

public class Room {
    // these private variables are examples of backing variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
   
    }

    // the following getters are accessor methods
    // the following setters are mutator methods
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return (!this.isOccupied) && (!this.isDirty);
    }

    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
        return;
    }

    public void checkout() {
        this.isOccupied = false;
        this.isDirty = true;
        return;
    }

    public void cleanroom() {
        this.isDirty = false;
        return;
    }
}