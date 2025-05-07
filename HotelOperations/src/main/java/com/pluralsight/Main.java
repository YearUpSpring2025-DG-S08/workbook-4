package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        // create instances of each class and test the logic
        String welcomeToHotelPrompt = """
                Welcome to the Silver Lantern Inn!""";
        System.out.println(welcomeToHotelPrompt);

        // test Employee class
        Employee e1 = new Employee(1, "Diamond", "Teacher Lead", 21);
        System.out.println(e1.getEmployeeID());
        System.out.println(e1.getName());
        System.out.println(e1.getDepartment());
        System.out.println(e1.getPayRate());
        
        // Monday
        e1.punchTimeCard(1);
        System.out.println(e1.isPunchedIn());
        e1.punchTimeCard(7);
        System.out.println(e1.isPunchedIn());
        
        // Tuesday
        e1.punchTimeCard(1);
        System.out.println(e1.isPunchedIn());
        e1.punchTimeCard(7);
        System.out.println(e1.isPunchedIn());
        
        // Wednesday
        e1.punchTimeCard(1);
        System.out.println(e1.isPunchedIn());
        e1.punchTimeCard(7);
        System.out.println(e1.isPunchedIn());
    }
}