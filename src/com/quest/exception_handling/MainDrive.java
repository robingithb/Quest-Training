package com.quest.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomException2 customException2 = null;
        try{
            System.out.println("Enter the name");
            String name = sc.nextLine();
            System.out.println("enter the numbers to divide");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter the query");
            sc.nextLine();
            String query = sc.nextLine();
            customException2 = new CustomException2(name,a,b,query);
        }catch (InputMismatchException i){
            i.printStackTrace();
        }
        finally {
            System.out.println("here");
        }
        try{
            customException2.divide();
            customException2.executeQuery();
        }catch (NullPointerException n){
            n.printStackTrace();
        }

    }
}
