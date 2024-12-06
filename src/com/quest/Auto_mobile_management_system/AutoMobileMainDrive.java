package com.quest.Auto_mobile_management_system;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AutoMobileMainDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControlManagement controlManagement = new ControlManagement();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Auto Mobile Management System ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Search Vehicle by Brand");
            System.out.println("3. Add Customer");
            System.out.println("4. Add Purchased Vehicle");
            System.out.println("5. View Purchased Orders (Sorted by Price)");
            System.out.println("6. Save Customer Details to File");
            System.out.println("7. Load Customer Details from File");
            System.out.println("8. View Purchase Timeline");
            System.out.println("9. Apply Discount on Vehicle");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle ID: ");
                    int vehicleId =intTypeCheck(sc);
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Brand: ");
                    String brand = stringTypeCheck(sc);

                    System.out.print("Enter Model: ");
                    String model = stringTypeCheck(sc);

                    System.out.print("Enter Price: ");
                    double price = doubleTypeCheck(sc);

                    System.out.print("fetching date and time");
                    LocalDateTime manufactureDate = LocalDateTime.now();
                    Vehicle vehicle = new Vehicle(vehicleId, brand, model, price, manufactureDate);
                    controlManagement.addVehicle(vehicle);
                    break;

                case 2:
                    System.out.print("Enter Brand to Search: ");
                    String searchBrand = stringTypeCheck(sc);
                    controlManagement.searchVehicleForSpecificBrand(searchBrand);
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    String customerId = stringTypeCheck(sc);

                    System.out.print("Enter Customer Name: ");
                    String customerName = stringTypeCheck(sc);

                    System.out.println("Enter email ID");
                    String email = sc.nextLine();

                    Customer customer = new Customer(customerId, customerName ,  email);
                    controlManagement.addCustomer(customer);
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    String purchaseCustomerId = stringTypeCheck(sc);

                    System.out.print("Enter Vehicle ID: ");
                    int purchaseVehicleId = intTypeCheck(sc);
                    sc.nextLine(); // Consume newline

                    try {
                        controlManagement.addPurchasedVehicle(purchaseCustomerId, purchaseVehicleId);
                    } catch (VehicleNotAvailableException e) {
                       e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.println("Order Details");
                    controlManagement.purchasedOrder();
                    break;

                case 6:
                    try {
                        controlManagement.saveCustomerDetails();
                    } catch (IOException e) {
                        System.out.println("Error saving data: " + e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        controlManagement.loadBackCustomerDetails();
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Error loading data: " + e.getMessage());
                    }
                    break;

                case 8:
                    System.out.println("Time line");
                    controlManagement.purchaseTimeline();
                    break;

                case 9:
                    System.out.print("Enter Vehicle ID for Discount: ");
                    int discountVehicleId = sc.nextInt();
                    try {
                        controlManagement.discountVehicle(discountVehicleId);
                    } catch (VehicleNotAvailableException | CloneNotSupportedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 10:
                    exit = true;
                    System.out.println("Exiting... Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
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
