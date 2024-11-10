package com.quest.practice_variables;

import java.util.Scanner;

public class SalaryManagement {
    final static int MAX_SALARY = 100000;
    final static int MIN_SALARY = 0;
    final static int MONTH = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOFEmployees = 0;
        System.out.println("Enter number of employees");
        numberOFEmployees = intTypeCheck(sc);
        //if someone try to enter negative or zero
        while (true) {
            if (numberOFEmployees <= 0) {
                System.out.println("Please enter correct number of employees !!!");
                numberOFEmployees = intTypeCheck(sc);
            } else {
                break;
            }
        }

        String[] names = new String[numberOFEmployees]; //to collect names of emp
        int[][] salary = new int[numberOFEmployees][MONTH];
        //12 is number of month and used to collect the salary per month
        int[] baseSalary = new int[numberOFEmployees]; //for enter base salary
        int[] totalSalary = new int[numberOFEmployees]; //total salary for the year
        double[] avgSalary = new double[numberOFEmployees];//Average monthly salary
        double[] bonus = new double[numberOFEmployees]; //bonus for each employee
        for (int i = 0; i < numberOFEmployees; i++) {
            System.out.println("Enter the name of employee");
            sc.nextLine();
            names[i] = stringTypeCheck(sc);
            System.out.println("Enter the base salary for " + names[i]);
            baseSalary[i] = salaryCheck(sc);
            System.out.println("Enter the salary per month");
            for (int j = 0; j < MONTH; j++) {
                System.out.println("Enter salary for month " + (j + 1));
                salary[i][j] = salaryCheck(sc);
                totalSalary[i] += salary[i][j];
            }
            avgSalary[i] = totalSalary[i] / MONTH;
            bonus[i] = (baseSalary[i] * 10) / 100; // its a equation used for find the bonus, bonus = (base Salary * 10)/ 100
        }

        for (int i = 0; i < numberOFEmployees; i++) {
            System.out.println("---Employee Salary Report---");
            displayDetails(i, names[i], baseSalary[i], salary[i], totalSalary[i], avgSalary[i], bonus[i]);
            //this is used to print the details
        }
        System.out.println("Thank you for using the employee Salary Management System");
        //closing the input stream
        sc.close();
    }

    private static void displayDetails(int i, String name, int baseSalary, int[] monthlySalary, int totalSalary, double avgSalary, double bonus) {
        System.out.println(("Employee Name : " + name));
        System.out.println("Base Salary : " + baseSalary);
        System.out.println(("Monthly Salary Breakdown :"));
        for (int j = 0; j < MONTH; j++) {
            System.out.println("Month " + (j + 1) + " :" + monthlySalary[j]);
        }
        System.out.println("Total Salary For The Year :" + totalSalary);
        System.out.println("Average Monthly Salary :" + avgSalary);
        System.out.println("Bonus :" + bonus);
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

    private static int salaryCheck(Scanner sc) {
        int s = 0; //store salary for temporary
        s = intTypeCheck(sc);

        while (true) {
            //it will ensure the value from specified range
            if (s <= MIN_SALARY || s > MAX_SALARY) {
                System.out.println("Please enter valid salary from the range 0 - 100000");
                s = intTypeCheck(sc);
            } else {
                //valid input so break it
                break;
            }
        }
        return s;  //it returns the valid salary
    }

    private static String stringTypeCheck(Scanner sc) {
        String employeeName;
        while (true) {

            employeeName = sc.nextLine();

            // Check if the input is non-empty and only contains letters and spaces
            if (employeeName.matches("[a-zA-Z\\s]+") && !employeeName.trim().isEmpty()) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid name (letters and spaces only).");
            }
        }
        return employeeName;
    }
}
