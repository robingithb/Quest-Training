package com.quest.oops.day10;

public class EquityStockAnalyzer extends StockAnalyzer{

    String sector;
    int maxPrice = 0;
    int minPrice = 0;
    double avgPrice = 0;
    int[] trend ;
    EquityStockAnalyzer(String stockName,String stockSymbol,int[] prices,String sector){
        super(stockName,stockSymbol,prices);
        this.sector = sector;
    }

    @Override
    int findMaxPrice() {
        if (prices == null || prices.length == 0) {
            return -1; // price is empty so we cant find max
        }
        int max = prices[0];
        for(int i = 1;i< prices.length;i++){
            if (max < prices[i]){
                max = prices[i];
            }
        }
        maxPrice = max;
        return max;
    }

    @Override
    int findMinPrice() {
        if (prices == null || prices.length == 0) {
            return -1; // price is empty so we cant find min
        }
        int min = prices[0];
        for(int i = 1;i< prices.length;i++){
            if (min > prices[i]){
                min = prices[i];
            }
        }
        minPrice = min;
        return min;
    }

    @Override
    double calculateAveragePrice() {
        if (prices == null || prices.length == 0) {
            return -1;// price is empty so we cant find avg
        }

        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        avgPrice = totalPrice/prices.length;
        return avgPrice;
    }

    @Override
    int[] findLongestIncreasingTrend() {
        if (super.prices == null || prices.length == 0) {
            return new int[]{-1, -1, 0}; // No trend possible
        }

        int maxLength = 0; // Length of the longest trend
        int currentLength = 1; // Current length of the increasing trend
        int startOfMax = 0; // Start index of the longest trend
        int currentStart = 0; // Start index of the current trend

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                // Continue the increasing trend
                currentLength++;
            } else {
                // End of the current increasing trend
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startOfMax = currentStart;
                }
                // Reset for the next trend
                currentLength = 1;
                currentStart = i;
            }
        }

        // Final check at the end of the array
        if (currentLength > maxLength) {
            maxLength = currentLength;
            startOfMax = currentStart;
        }

        // Calculate the end index of the longest trend
        int endOfMax = startOfMax + maxLength - 1;
        trend = new int[]{startOfMax, endOfMax, maxLength};
        return trend;
    }

    @Override
    void displayAnalysis() {

        System.out.println("Analysis for Equity Stocks");
        System.out.println("Stock Name = "+super.stockName);
        System.out.println("Stock Symbol = "+super.stockSymbol);
        System.out.println("Sector = "+this.sector);
        System.out.println("Highest price = "+this.maxPrice);
        System.out.println("Lowest Price = "+this.minPrice);
        System.out.println("Average price = "+this.avgPrice);
        System.out.println("Longest Increasing Trend : start day: "+this.trend[0] +" End day : "+this.trend[1] +" Length : "+this.trend[2]);

    }
}
