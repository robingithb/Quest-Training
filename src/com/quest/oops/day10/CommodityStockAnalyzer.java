package com.quest.oops.day10;

public class CommodityStockAnalyzer extends StockAnalyzer{

    String commodityType;


    CommodityStockAnalyzer(String stockName,String stockSymbol,int[] prices, String commodityType){
        super(stockName,stockSymbol,prices);
        this.commodityType = commodityType;

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

        return max;
    }

    @Override
    int findMinPrice() {
        int min;
        if (prices == null || prices.length == 0) {
            return -1; // price is empty so we cant find min
        }
        min = prices[0];
        for(int i = 1;i< prices.length;i++){
            if (min > prices[i]){
                min = prices[i];
            }
        }

        return min;
    }

    @Override
    double calculateAveragePrice() {
        double avg;
        if (prices == null || prices.length == 0) {
            return -1;// price is empty so we cant find avg
        }

        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        avg= totalPrice/prices.length;
        return avg;
    }

    @Override
    int[] findLongestIncreasingTrend() {
        if (prices == null || prices.length == 0) {
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

        return new  int[]{startOfMax, endOfMax, maxLength};
    }

    @Override
    void displayAnalysis() {
        int[] CommodityTrend  = findLongestIncreasingTrend();
        System.out.println("Analysis for Commodity ");
        System.out.println("Stock Name = "+super.stockName);
        System.out.println("Stock Symbol = "+super.stockSymbol);
        System.out.println("Sector = "+this.commodityType);
        System.out.println("Highest price = "+findMaxPrice());
        System.out.println("Lowest Price = "+findMinPrice());
        System.out.println("Average price = "+calculateAveragePrice());
        System.out.println("Longest Increasing Trend : start day: "+(CommodityTrend[0]+1 )+" End day : "+(CommodityTrend[1]+1) +" Length : "+CommodityTrend[2]);
    }
}
