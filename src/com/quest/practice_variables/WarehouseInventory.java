package com.quest.practice_variables;

public class WarehouseInventory {
    public static void main(String[] args) {
        // Step 1: Initialize product names, warehouse quantities, and branch stock
        String[] productNames = {"Laptop", "Phone", "Tablet", "Headphones", "Smartwatch"};
        int[] warehouseStock = {120, 150, 100, 200, 80};
        int[][] branchStock = {
                {50, 30, 60},  // Laptop stock across 3 branches
                {40, -1, 60},  // Phone stock (missing in Branch 2)
                {30, 20, 15},  // Tablet stock
                {100, 90, 80}, // Headphones stock
                {50, 55, -1}   // Smartwatch stock (missing in Branch 3)
        };

    }
    public static void calculateTotalStock(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        int[] totalStock = new int[productNames.length];
        for (int i = 0;i<productNames.length;i++){

        }
    }
}
