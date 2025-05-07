package com.pluralsight;

// Hotel class should track name, numberOfSuites, numberOfRooms, bookedSuited and bookedBasicRooms
// no public setters for these variables
public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;
    
    // this constructor sets bookedSuited and bookedBasicRooms to 0
    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    
    // this constructor specifies number of bookedSuites and bookedBasicRooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    
    // user can book one or more rooms(if available)
    // user will specify how many rooms and if it is a suite or basic room
    // method should determine if there are enough rooms available and update the booked inventory
    // method should return true/false if the rooms were booked
    public boolean bookRoom(int roomsDesired, boolean isSuite){
        if(isSuite){
          if(bookedSuites + roomsDesired <= numberOfSuites){
              bookedSuites += numberOfRooms;
              return true;
          } else if(bookedBasicRooms + roomsDesired <= this.numberOfRooms){
            bookedBasicRooms += roomsDesired;
            return true;
          }
      }
        return false;
    }
    
    // derived getter - should NOT have a private backing variable
    // should calculate response based on other member variables
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    // derived getter - should NOT have a private backing variable
    // should calculate response based on other member variables
    public int getAvailableRooms(){
      return numberOfRooms - bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
