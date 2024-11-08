package com.quest.practice_variables;

public class ControlFlow {
    public static void main(String[] args) {
        int number = 10;
        if (number < 10) {
            System.out.println(number + " number is negative");
        } else if (number == 10) {
            System.out.println(number + " number is Zero");
        } else {
            System.out.println(number + " number is positive");
        }
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "SaterDay":
                System.out.println("Saterday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not The day");
                break;


        }
        testForLoop();
        testWhileLoop();
        testDoWhileLoop();


    }

    static void testForLoop() {
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0 ){
                System.out.println("Even number "+ i);
                continue;
            }
            else {
                continue;
            }

        }
    }

    static void testWhileLoop() {
        System.out.println("while loop");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
    static void testDoWhileLoop(){
        System.out.println("Do while");
        int i =0;
        do {
            System.out.println(i);
            i++;
        }while (i<5);
    }
}
