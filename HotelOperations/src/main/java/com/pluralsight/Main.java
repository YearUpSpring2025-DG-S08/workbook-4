package com.pluralsight;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // create instances of each class and test the logic
        String welcomeToHotelPrompt = """
                Welcome to the Silver Lantern Inn!""";
        System.out.println(welcomeToHotelPrompt);




        Room r1 = new Room(1, 150);
        System.out.println(r1.isAvailable());
        r1.checkIn();
        System.out.println(r1.isAvailable());
        
        Employee e1 = new Employee(1, "Kyle", "guest services", 10);
        e1.punchIn(8);
        e1.punchOut(13);
        System.out.println(e1.totalPay());
        
        
    }
}