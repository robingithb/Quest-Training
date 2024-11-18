package com.quest.oops.day10;

public class CommodityStockAnalyzer extends StockAnalyzer{

    String commodityType;
    int CommodityMaxPrice = 0;
    int CommodityMinPrice = 0;
    double CommodityAvgPrice = 0;
    int[] CommodityTrend ;
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
        CommodityMaxPrice = max;
        return CommodityMaxPrice;
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
        CommodityMinPrice = min;
        return CommodityMinPrice;
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
        CommodityAvgPrice = totalPrice/prices.length;
        return CommodityAvgPrice;
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
        CommodityTrend = new int[]{startOfMax, endOfMax, maxLength};
        return CommodityTrend;
    }

    @Override
    void displayAnalysis() {
        System.out.println("Analysis for Equity Commodity ");
        System.out.println("Stock Name = "+super.stockName);
        System.out.println("Stock Symbol = "+super.stockSymbol);
        System.out.println("Sector = "+this.commodityType);
        System.out.println("Highest price = "+this.CommodityMaxPrice);
        System.out.println("Lowest Price = "+this.CommodityMinPrice);
        System.out.println("Average price = "+this.CommodityAvgPrice);
        System.out.println("Longest Increasing Trend : start day: "+this.CommodityTrend[0] +" End day : "+this.CommodityTrend[1] +" Length : "+this.CommodityTrend[2]);
    }
}
