package com.pluralsight;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {

        // create instances of each class and test the logic
        String welcomeToHotelPrompt = """
                Welcome to the Silver Lantern Inn!""";
        System.out.println(welcomeToHotelPrompt);

        // test Employee class
        Employee e1 = new Employee(1,"Diamond","Teacher Lead", 21);
        System.out.println(e1.getEmployeeID());
        System.out.println(e1.getName());
        System.out.println(e1.getDepartment());
        System.out.println(e1.getPayRate());
//        e1.punchIn();
//        System.out.println(e1.punchedIn);
//        System.out.println(    );
//        e1.punchTimeCard(24);
//        System.out.println(e1.punchedIn);
//        System.out.println(   );
        System.out.println(e1.punchedIn);
        e1.punchTimeCard(7);
        System.out.println(e1.punchedIn);
        e1.punchTimeCard(13);
        System.out.println(e1.punchedIn);
//        System.out.println(   );
//        e1.punchTimeCard();
//        System.out.println(e1.punchedIn);
        
        
                
    }
}