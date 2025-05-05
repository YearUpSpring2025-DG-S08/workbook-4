package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;
    
    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){
          if(bookedSuites + numberOfRooms <= numberOfSuites){
              bookedSuites += numberOfRooms;
              return true;
          } else if(bookedBasicRooms + numberOfRooms <= this.numberOfRooms){
            bookedBasicRooms += numberOfRooms;
            return true;
          }
      }
        return false;
    }
    
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
    
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
