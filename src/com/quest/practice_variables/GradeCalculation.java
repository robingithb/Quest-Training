package com.quest.practice_variables;

import java.util.Scanner;


public class GradeCalculation {
    static final int MAX_SCORE = 100;

    public static void main(String[] args) {
        //for input purpose
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = 0;
        //here we call this function to check it integer or not
        numberOfStudents = intTypeCheck(sc);
        while (true) {
            //here checking of specified range
            if (numberOfStudents <= 0) {
                System.out.println("Please enter correct number of students !!!");
                numberOfStudents = intTypeCheck(sc);

            }
            //if it valid so break the loop
            else {
                break;
            }
        }
        String[] names = new String[numberOfStudents]; // store students name
        int[] mathsScore = new int[numberOfStudents]; //for maths score
        int[] scienceScore = new int[numberOfStudents]; //for science score
        int[] englishScore = new int[numberOfStudents]; //for english score
        int[] totalScore = new int[numberOfStudents]; //to store total score
        double[] avgScore = new double[numberOfStudents]; // to store the average
        char[] grade = new char[numberOfStudents]; //to store grades

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name");
            sc.nextLine();
            names[i] = stringTypeCheck(sc); //checking type of the name
            //getScore is used to store marks for each subject
            getScore("Enter the mark for Maths", sc, mathsScore, i);
            getScore("Enter the mark for English", sc, englishScore, i);
            getScore("Enter the mark for science", sc, scienceScore, i);
            //finding the total score
            totalScore[i] = mathsScore[i] + englishScore[i] + scienceScore[i];
            //if students totalScore less than 50
            if (totalScore[i] < 50) {
                break;
            }
            //finding the average score
            avgScore[i] = totalScore[i] / 3;
            //assigning grades here
            if (avgScore[i] >= 90) {
                grade[i] = 'A';
            } else if (avgScore[i] >= 80 && avgScore[i] < 90) {
                grade[i] = 'B';
            } else if (avgScore[i] >= 70 && avgScore[i] < 80) {
                grade[i] = 'C';
            } else if (avgScore[i] >= 60 && avgScore[i] < 70) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }


        }
        //here display the details of students
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Name = " + names[i]);
            System.out.println("total = " + totalScore[i]);
            //to print the feedback
            feedbackMessage(grade[i]); //passing the grades
            //for individual subjects
            if (mathsScore[i] < 50) {
                System.out.println("Warning: Needs improvement in Maths");
            }
            if (englishScore[i] < 50) {
                System.out.println("Warning: Needs improvement in English");
            }
            if (scienceScore[i] < 50) {
                System.out.println("Warning: Needs improvement in Science");
            }
            System.out.println("-----------------");
        }
        sc.close();
    }

    private static void getScore(String message, Scanner sc, int[] subScore, int i) {
        System.out.println(message);
        //type checking here
        int p = intTypeCheck(sc);

        while (true) {
            //for ensure specified range
            if (p <= 0 || p > MAX_SCORE) {
                System.out.println("Enter Valid Marks");
                p = sc.nextInt();

            } else {
                subScore[i] = p;
                break;
            }
        }
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
    private static void feedbackMessage(char grade){
        switch (grade) {
            case 'A':
                System.out.println("grade = A");
                System.out.println("Excellent performance");
                break;
            case 'B':
                System.out.println("grade = B");
                System.out.println("Good job but you can aim higher");
                break;
            case 'C':
                System.out.println("grade = C");
                System.out.println("You need to put in more effort");
                break;
            case 'D':
                System.out.println("grade = D");
                System.out.println("Your performance is below expectations. Consider seeking help");
                break;
            case 'F':
                System.out.println("grade = F");
                System.out.println("Failure. You need significant improvement");
                break;
        }
    }
}