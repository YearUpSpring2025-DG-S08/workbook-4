package com.pluralsight;

public class Reservation {
    private String guestName;
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend = false;

    public Reservation(String guestName, String roomType, int numberOfNights, boolean isWeekend) {
        this.guestName = guestName;
        this.roomType = roomType;
        if(numberOfNights <= 0){
            throw new IllegalArgumentException("You cannot book a reservation for 0 night!");
        }
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // the room type can either be a "king" or "double"
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType){
        if(roomType.isBlank()){
            throw new IllegalArgumentException("You must pick a King or Double");
        }
        
        if(roomType.equalsIgnoreCase("king")){
            this.roomType = roomType;
        } else if(roomType.equalsIgnoreCase("double")){
            this.roomType = roomType;
        }
    }
    
    // the price of a "king" is $139/night or "double" is $124/night
    // a weekend stay increases price by 10%
    public double getPrice() throws Exception {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124;
        } else {
            throw new Exception("Invalid room type");
        }

        if (isWeekend == true) {
            price = price + (price * .1);
        }

        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }
    
    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() throws Exception {
        double reservationTotal = getPrice() * numberOfNights;
        return reservationTotal;
    }
}