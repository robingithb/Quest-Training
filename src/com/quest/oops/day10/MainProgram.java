package com.quest.oops.day10;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details for Equity Stock");
        System.out.println("Stock Name");
        String stockName = sc.nextLine();
        System.out.println("Stock Symbol");
        String stockSymbol = sc.nextLine();
        System.out.println("Sector");
        String sector = sc.nextLine();
        System.out.println("Enter number of days");
        int numberOfDays = sc.nextInt();
        System.out.println("Enter Prices");
        int[] prices = new int[numberOfDays];
        for(int i =0;i<numberOfDays;i++){
            prices[i] = sc.nextInt();
        }

        System.out.println("Enter the Details for Commodity Stock");
        sc.nextLine();
        System.out.println("Stock Name");
        String commodityStockName = sc.nextLine();
        System.out.println("Stock Symbol");
        String commodityStockSymbol = sc.nextLine();
        System.out.println("Sector");
        String commoditySector = sc.nextLine();
        System.out.println("Enter number of days");
        int commodityNumberOfDays = sc.nextInt();
        System.out.println("Enter Prices");
        int[] commodityPrices = new int[numberOfDays];
        for(int i =0;i<numberOfDays;i++){
            prices[i] = sc.nextInt();
        }
        StockAnalyzer equity = new EquityStockAnalyzer(stockName,stockSymbol,prices,sector);
        StockAnalyzer commodity = new CommodityStockAnalyzer(commodityStockName,commodityStockSymbol,commodityPrices,commoditySector);

        int maxPrice = equity.findMaxPrice();
        int minPrice = equity.findMinPrice();
        double avgPrice  = equity.calculateAveragePrice();
        int[] trend = equity.findLongestIncreasingTrend();
        equity.displayAnalysis();

       commodity.displayAnalysis();
       int commodityMaxPrice = commodity.findMaxPrice();
        int commodityMinPrice = commodity.findMinPrice();
        double commodityAvgPrice = commodity.calculateAveragePrice();
        int[] commodityTrend = commodity.findLongestIncreasingTrend();

        double highestAvg = 0;
        String highest ;
        if(avgPrice > commodityAvgPrice){
            highest = sector;
            System.out.println("Stock with Highest Average Price: " +sector +" with Average Price:  "+avgPrice);
        }
        else {

        }


//

    }
}
