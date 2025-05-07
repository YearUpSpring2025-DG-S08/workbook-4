package com.pluralsight;

public class Room {
    // these private variables are examples of backing variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.price = 124;
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

    // a room is only available if it is clean and not currently occupied
    public boolean isAvailable() {
        return (!this.isOccupied) && (!this.isDirty);
    }

    // once a room is checked in, it should be occupied and dirty
    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
        return;
    }

    // when a guest checks out, a room must be cleaned before a guest can check in
    public void checkOut() {
        this.isOccupied = false;
        cleanRoom();
        return;
    }

    public void cleanRoom() {
        this.isDirty = false;
        return;
    }
}