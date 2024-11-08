package com.quest.practice_variables;

public class PracticeVars {

    public static void main(String[] args) {
        int age = 10;
        double salary = 25000.00;
        char gender = 'M';
        String FirstName = "Robin";
        String LastName = "Thomas";

        System.out.println("age ="+age);
        System.out.println("salary = "+salary);
        System.out.println("Gender = "+gender);
        System.out.println("First Name = "+FirstName);
        System.out.println("Last Name = "+LastName);
        practiceConversions();
        stringConcatenation();

        }
        private static void practiceConversions(){
        int a = 20;
        double b = 25.50;
        double sum = a+b;
        int round = (int)b;
        System.out.println("sum = "+sum);
            System.out.println("Round = "+round);
        }
        private static void stringConcatenation(){
         String first = "Nithin";
         String last = "Thomas";
         String Name = first+" "+last;
         System.out.println("Name ="+Name);
         int a= 20;
         System.out.println("age = "+a+" Name = "+Name);


        }
        private static  void stringMethods(){
          String s1 = "John";
          String s2 = "Snow";
          String s3 = new String("hello World");
          System.out.println(s3.length());
        }
}
