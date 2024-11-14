package com.quest.practice_variables;

import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products");
        int productNumber = sc.nextInt();
        sc.nextLine();
        while(true){
            if(productNumber < 0 || productNumber >100){
                System.out.println("Enter the correct range 0-100");
                productNumber = sc.nextInt();
                sc.nextLine();
            }
            else {
                break;
            }
        }
        System.out.println("Enter names of the products");
        String[] products = new String[productNumber];
        for(int i = 0; i< productNumber; i++){
            products[i] = sc.nextLine();
        }
        System.out.println("Enter the stock and price");
        double[][] inventory = new double[productNumber][2];
        for (int i = 0; i<productNumber;i++){
            System.out.println("enter quantity for "+products[i]);
            inventory[i][0] = sc.nextDouble();
            System.out.println("enter price for "+products[i]);
            inventory[i][1] = sc.nextDouble();
            while (true){
                if(inventory[i][1] <= 0){
                    System.out.println("enter the correct price");
                    inventory[i][1] = sc.nextDouble();
                }
                else break;
            }
        }
        System.out.println("Enter quantity to be sold");
        int[] quantitiesSold = new int[productNumber];
        for(int i =0; i< productNumber; i++){
            quantitiesSold[i] = sc.nextInt();
            while(true){
                if(quantitiesSold[i] < 0){
                    System.out.println("Enter the correct quantity");
                    quantitiesSold[i] = sc.nextInt();
                }
                else break;
            }
        }

        salesReport(products,inventory,quantitiesSold);
        System.out.println("----------------");
        shortageCheck(products,inventory,quantitiesSold);
        System.out.println("----------------");
        restockInventory(products,inventory,sc);
        System.out.println("----------------");
        salesSummery(products,inventory,quantitiesSold,sc);
        System.out.println("----------------");
        trackOutOfStock(products,inventory);




    }
    private  static  void salesReport(String[] products , double[][] inventory , int[] quantitiesSold){
        double revenue ;
        double totalRevenue = 0;
        System.out.println("Sales Report");
        for(int i = 0;i<inventory.length;i++){
            revenue = inventory[i][1] * quantitiesSold[i];
            System.out.println(products[i] + " sold "+quantitiesSold[i]+" units, Revenue : $"+revenue);
            totalRevenue += revenue;
        }
        System.out.println("Total Revenue :"+totalRevenue);
    }
    private static  void shortageCheck(String[] products , double[][] inventory , int[] quantitiesSold){
        boolean flag = false;
        for(int i = 0; i<inventory.length; i++){
            if(inventory[i][0] < quantitiesSold[i]){
                System.out.println("Warning: Insufficient stock for "+products[i]+ ". Sold " +quantitiesSold[i]+" units, but only "
                        +inventory[i][0]+" units were available.");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("There is no shortage of the products");
        }
    }
    private static void restockInventory(String[] products , double[][] inventory , Scanner sc){
        System.out.println("Restock Inventory");
        sc.nextLine();
        System.out.println("Enter the name of the product need to be restock");
        String nameProduct  = sc.nextLine();
        System.out.println("Enter amount of the product need to be restock");
        int numberOfStock = sc.nextInt();
        sc.nextLine();
        while(true) {
            if (numberOfStock < 0) {
                System.out.println("Enter the correct quantity");
                numberOfStock = sc.nextInt();
                sc.nextInt();
            } else break;
        }

        for(int i = 0;i<products.length; i++){
            if(nameProduct.equalsIgnoreCase(products[i])){
                inventory[i][0] += numberOfStock;
                System.out.println("Restocking "+products[i]+" with "+numberOfStock);
                System.out.println("Updated stock for "+products[i] +": "+inventory[i][0]+" units");
            }
        }
    }
    private static void salesSummery(String[] products , double[][] inventory ,int[] quantitiesSold,Scanner sc){
        System.out.println("Sales Summery");
        System.out.println("Enter the price range");
        int min = sc.nextInt();
        int max = sc.nextInt();
        sc.nextLine();
        while(true){
            if(min< 0 || max < 0 || min>max){
                System.out.println("Please enter the correct range");
                min = sc.nextInt();
                max = sc.nextInt();
                sc.nextInt();
            }
            else break;
        }
        boolean flag = false;
        for(int i = 0 ; i< inventory.length; i++){
            if(inventory[i][1] > min && inventory[i][1] < max){
                System.out.println(products[i] +" Revenue :"+(inventory[i][1]*quantitiesSold[i]));
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Not in the range");
        }
    }
    private static void trackOutOfStock(String[] products , double[][] inventory){
        System.out.println("Track Out Of Stock");
        boolean flag = false;
        System.out.println("Products out of stock");
        for(int i = 0;i<inventory.length;i++){
            if( inventory[i][0] <= 0){
                System.out.println(products[i]);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("No products");
        }
    }
}
