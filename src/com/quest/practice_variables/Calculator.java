package com.quest.practice_variables;

import java.lang.Math;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        double result = 0;
        while (repeat) {
            System.out.println("Enter your choice \n" +
                    "Addition = 1 \n" +
                    "Substraction = 2 \n" +
                    "Multiplication = 3 \n" +
                    "Division = 4\n" +
                    "Square root = 5\n" +
                    "Clear = 6\n" +
                    "Exit = 7 ");
            int op = sc.nextInt();
            int a;
            switch (op) {
                case 1:
                    System.out.println("Enter the number to add");
                    a = sc.nextInt();
                    result = result + a;
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Enter the number to sub");
                    a = sc.nextInt();
                    result = result - a;
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Enter the number to mul");
                    a = sc.nextInt();
                    result = result * a;
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Enter the number to divide");
                    a = sc.nextInt();
                    if (result == 0 || a == 0) {
                        System.out.println("Divisible by Zero ,Error");
                    } else if (result < a) {
                        System.out.println("Error");
                    } else {
                        result = result / a;
                        System.out.println(result);
                    }
                    break;
                case 5:
                    if (result < 0) {
                        System.out.println("Negative number");
                    } else {
                        result = Math.sqrt(result);
                        System.out.println(result);
                    }
                    break;
                case 6:
                    result = 0;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Do you want to perform another operation y/n");
            char ans = sc.next().charAt(0);
            if (ans == 'n') {
                repeat = false;
            }
        }
    }
}


