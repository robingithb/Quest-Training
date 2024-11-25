package com.quest.exception_handling.organization;

import com.quest.oops.library_management.Members;

import javax.xml.transform.Templates;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrganizationMainDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        double salary ;
        Employee employee = null;

        while (true) {

            System.out.println("Enter Name");

             name = sc.nextLine();
            System.out.println("Enter age");
             age = sc.nextInt();
            System.out.println("Enter salary");
            salary = sc.nextDouble();

            try {
                employee = new Employee(name, age, salary);
                break;
            } catch (InvalidInputException | InputMismatchException i) {
                System.out.println(i.getMessage());
            }
            sc.nextLine();
        }
        Manager manager = null;
        while (true){

//            sc.nextLine();
//            System.out.println("Enter Name");
//           String  name = sc.nextLine();
//            System.out.println("Enter age");
//           int age = sc.nextInt();
//            System.out.println("Enter salary");
//            salary = sc.nextDouble();
            System.out.println("Enter team size");
            int teamSize = sc.nextInt();
            sc.nextLine();
            try {
                manager = new Manager(name, age, salary, teamSize);
                break;
            } catch (IllegalArgumentException | InvalidInputException | InputMismatchException i) {
                System.out.println(i.getMessage());
            }


        }
        if (manager != null) {
            manager.display();
        } else {
            System.out.println("try again");
        }
    }
}
