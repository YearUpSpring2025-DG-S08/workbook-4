package com.pluralsight;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {

        // create instances of each class and test the logic
        String welcomeToHotelPrompt = """
                Welcome to the Silver Lantern Inn!""";
        System.out.println(welcomeToHotelPrompt);

        // test Reservation class
        Reservation r1 = new Reservation("Damian", "King", 3, false);
        System.out.println(r1.getGuestName());
        System.out.println(r1.getRoomType());
        System.out.println(r1.getNumberOfNights());
        System.out.println("Is it a weekend stay?: " + r1.isWeekend());
        System.out.println("The room price is: " + r1.getPrice());
        System.out.printf("Reservation price is: %.2f", r1.getReservationTotal());
    }
}