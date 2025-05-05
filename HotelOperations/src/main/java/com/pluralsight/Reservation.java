package com.pluralsight;

public class Reservation {
    private String guestName;
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;
    
    public Reservation(String guestName, String roomType, double price, int numberOfNights, boolean isWeekend){
        this.guestName = guestName;
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = false;
        this.reservationTotal = reservationTotal;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

<<<<<<< HEAD
    public double getPrice() throws Exception {
        if(roomType.equalsIgnoreCase("king")){
            price = 139;
        } else if(roomType.equalsIgnoreCase("double")){
            price = 124;
        } else{
            throw new Exception("Invalid room type");
=======
    public double getPrice() {
        if(getRoomType().equals("king")){
            price = 139;
        } else if(getRoomType().equals("double")){
            price = 124;
>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
        }
        
        if(isWeekend() == true){
            price = price + (price * .1);
        }
        
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

<<<<<<< HEAD

=======
>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    public boolean isWeekend() {
        return isWeekend;
    }

<<<<<<< HEAD
    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    
    public double getReservationTotal() throws Exception {
        return getPrice() * numberOfNights;
=======
    public double getReservationTotal(){
        return reservationTotal;
>>>>>>> bf268ac364f5824cbd2e54a373d9ba2402221abb
    }
}