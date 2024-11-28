package com.quest.case_studies.telecom_subscriber_management_system;

import java.util.Scanner;

public class MainDrive {


    public static void main(String[] args) {
        SubscriberManagement manager = new SubscriberManagement();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\n1. Add Subscriber\n2. Record Call\n3. Display Call History" +
                    "\n4. Subscriber list \n5. Update Subscriber Name\n6. Update Subscriber Phone NUmber" +
                    "\n7. Generate Bill\n8. Update Balance\n9. Exit");
            System.out.print("Choose an option: ");
            int choice = intTypeCheck(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Phone, Balance, and Type (Prepaid/Postpaid): ");
                    int id = intTypeCheck(sc);
                    String name = stringTypeCheck(sc);
                    int phoneNumber = intTypeCheck(sc);
                    double balance = doubleTypeCheck(sc);
                    String type = stringTypeCheck(sc);
                    try {
                        if (type.equalsIgnoreCase("prepaid")) {
                            manager.addSubscribers(new PrePaidUsers(id, name, phoneNumber, balance));
                        } else if (type.equalsIgnoreCase("postpaid")) {
                            manager.addSubscribers(new PostpaidUsers(id, name, phoneNumber, balance));
                        } else {
                            System.out.println("Invalid subscriber type!");
                        }
                    } catch (NotFoundUser f) {
                        f.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.print("Enter Subscriber ID, Call Type (Local/STD/ISD), and Duration: ");
                    id = intTypeCheck(sc);
                    String callType = stringTypeCheck(sc);
                    double duration = doubleTypeCheck(sc);
                    try {
                        manager.recordCall(id, callType, duration);
                    } catch (NotFoundUser f) {
                        f.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.print("Enter Subscriber ID: ");
                    id = intTypeCheck(sc);
                    try {
                        manager.displayCallHistory(id);
                    } catch (NotFoundUser f) {
                        f.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Subscriber List\n");
                    manager.displaySubscribes();
                    break;

                case 5:
                    System.out.print("Enter Subscriber ID and new name");
                    id = intTypeCheck(sc);
                    String newName = stringTypeCheck(sc);
                    try {
                        manager.updateName(id, newName);
                    } catch (NotFoundUser f) {
                        f.printStackTrace();
                    }
                    break;

                case 6:
                    System.out.print("Enter Subscriber ID and new Phone Number");
                    id = intTypeCheck(sc);
                    int newNumber = intTypeCheck(sc);
                    try {
                        manager.updatePhoneNumber(id, newNumber);
                    } catch (NotFoundUser f) {
                        f.printStackTrace();
                    }
                    break;
                case 7:
                    System.out.print("Enter Subscriber ID: ");
                    id = intTypeCheck(sc);
                    try {
                        manager.generateBills(id);
                    } catch (NotFoundUser | UserNotSupported f) {
                        f.printStackTrace();
                    }
                    break;
                case 8:
                    System.out.print("Enter Subscriber ID and new amount recharge");
                    id = intTypeCheck(sc);
                    double newAmount = doubleTypeCheck(sc);
                    try {
                        manager.balanceUpdate(id, newAmount);
                    } catch (NotFoundUser | UserNotSupported f) {
                        f.printStackTrace();
                    }
                    break;
                case 9:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("invalid option...!!!!");
                    break;
            }
            if (choice == 9) {
                break;
            }

        }
        System.out.println("saving data");
        //saving to file
        try {
            manager.saveSubscribers();
        } catch (Exception i) {
            i.printStackTrace();
        }

        System.out.println("Do you wanna load previous data");
        String answer = stringTypeCheck(sc);
        //load from file
        if (answer.equalsIgnoreCase("yes")) {
            try {
                manager.retrievingSubscribers();
            } catch (Exception i) {
                i.printStackTrace();
            }
        }
    }

    //to check integer values
    private static int intTypeCheck(Scanner sc) {
        int value; //store  temporary
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid Integer NUmber");
            sc.next();
        }
        value = sc.nextInt();
        return value; //it returns the integer value
    }

    //to check boolean values
    private static boolean booleanTypeCheck(Scanner sc) {
        boolean value; //store  temporary
        while (!sc.hasNextBoolean()) {
            System.out.println("Enter valid Boolean");
            sc.next();
        }
        value = sc.nextBoolean();
        return value; //it returns the boolean value
    }

    //to check string values
    private static String stringTypeCheck(Scanner sc) {
        String str;
        while (true) {
            sc.nextLine();
//            System.out.println("Enter a valid String (letters and spaces only): ");
            str = sc.nextLine();
            // Check if the input is nonempty and only contains letters and spaces
            if (str.matches("[a-zA-Z\\s]+") && !str.trim().isEmpty()) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid name (letters and spaces only).");
            }
        }
        return str;
    }

    //to check double values
    private static double doubleTypeCheck(Scanner sc) {
        double value; //store  temporary
        while (!sc.hasNextDouble()) {
            System.out.println("Enter valid double");
            sc.next();
        }
        value = sc.nextDouble();
        return value; //it returns the boolean value
    }
}
