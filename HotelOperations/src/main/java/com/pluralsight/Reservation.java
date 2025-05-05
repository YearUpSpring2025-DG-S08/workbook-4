package com.pluralsight;

public class Reservation {
    private String guestName;
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String guestName, String roomType, double price, int numberOfNights, boolean isWeekend) {
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

    public double getPrice() throws Exception {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124;
        } else {
            throw new Exception("Invalid room type");
        }

        if (isWeekend() == true) {
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


    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return 0;
    }
}