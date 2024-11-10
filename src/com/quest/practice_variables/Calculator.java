package com.quest.practice_variables;

import java.lang.Math;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;
        while (true) {
            System.out.println("Enter your choice \n" +
                    "Addition = 1 \n" +
                    "Subtraction = 2 \n" +
                    "Multiplication = 3 \n" +
                    "Division = 4\n" +
                    "Square root = 5\n" +
                    "Clear = 6\n" +
                    "Exit = 7 ");
            int op = intTypeCheck(sc);
            int a;
            switch (op) {
                case 1:
                    System.out.println("Enter the number to add");
                    a = intTypeCheck(sc);
                    //adding to numbers
                    result = result + a;
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Enter the number to sub");
                    a = intTypeCheck(sc);
                    //subtracting two numbers
                    result = result - a;
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Enter the number to mul");
                    a = intTypeCheck(sc);
                    //multiplication
                    result = result * a;
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Enter the number to divide");
                    a = intTypeCheck(sc);
                    //ensure divider and dividend are non zeros
                    if (result == 0 || a == 0) {
                        System.out.println("Divisible by Zero ,Error");
                    }
                    //checking for divider lesser than dividend
                    else if (result < a) {
                        System.out.println("Error");
                    }
                    //dividing two numbers
                    else {
                        result = result / a;
                        System.out.println(result);
                    }
                    break;
                case 5:
                    //checking for negative number
                    if (result < 0) {
                        System.out.println("Negative number");
                    }
                    //finding the square root
                    else {
                        result = Math.sqrt(result);
                        System.out.println(result);
                    }
                    break;
                case 6:
                    //clear the tab
                    result = 0;
                    System.out.println(result);
                    break;
                    //for invalid options
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Do you want to perform another operation y/n");
            char ans = sc.next().charAt(0);
            //here exit from the calculator
            if (ans == 'n') {
                break;
            }
        }
        //removing the input scanner
        sc.close();
    }
    private static int intTypeCheck(Scanner sc) {
        int value = 0; //store  temporary
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid Integer NUmber");
            sc.next();
        }
        value = sc.nextInt();
        return value; //it returns the integer value
    }
}


