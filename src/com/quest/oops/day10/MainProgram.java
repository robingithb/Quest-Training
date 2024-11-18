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
        for (int i = 0; i < numberOfDays; i++) {
            prices[i] = sc.nextInt();
        }
        StockAnalyzer equity = new EquityStockAnalyzer(stockName, stockSymbol, prices, sector);

        System.out.println("Enter the Details for Commodity Stock");
        sc.nextLine();
        System.out.println("Commodity Type");
        String commodityStockName = sc.nextLine();
        System.out.println("Stock Symbol");
        String commodityStockSymbol = sc.nextLine();
        System.out.println("Sector");
        String commodityType = sc.nextLine();
        System.out.println("Enter number of days");
        int commodityNumberOfDays = sc.nextInt();
        System.out.println("Enter Prices");
        int[] commodityPrices = new int[commodityNumberOfDays];
        for (int i = 0; i < commodityNumberOfDays; i++) {
            commodityPrices[i] = sc.nextInt();
        }
        StockAnalyzer commodity = new CommodityStockAnalyzer(commodityStockName, commodityStockSymbol, commodityPrices, commodityType);


        equity.displayAnalysis();
        System.out.println("-----------------------");
        commodity.displayAnalysis();
        System.out.println("\n");


        if (equity.calculateAveragePrice() > commodity.calculateAveragePrice()) {

            System.out.println("Stock with Highest Average Price: " + stockName + " with Average Price:  " + equity.calculateAveragePrice());
        } else {
            System.out.println("Stock with Highest Average Price: " + commodityStockName + " with Average Price:  " + commodity.calculateAveragePrice());
        }
        System.out.println("\n");

        int[] trend = equity.findLongestIncreasingTrend();
        int[] commodityTrend = commodity.findLongestIncreasingTrend();
        if (trend[2] > commodityTrend[2]) {
            System.out.println("Stock with Longest Increasing Trend: " +stockName + " length :" + trend[2]);
        } else if (trend[2] < commodityTrend[2]) {
            System.out.println("Stock with Longest Increasing Trend: " + commodityStockName + " length :" + commodityTrend[2]);
        } else {
            System.out.println("Stock with Longest Increasing Trend: Both " + stockName + " and " + commodityStockName + " with a trend length of " + trend[2] + " days.\n");

        }


//

    }
}
