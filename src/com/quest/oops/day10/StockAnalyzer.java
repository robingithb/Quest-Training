package com.quest.oops.day10;
//abstract class stock analyzer
public abstract class StockAnalyzer {
    String stockName;
    String stockSymbol;
    int[] prices;

    //constructor  for initializing
    StockAnalyzer(String stockName,String stockSymbol,int[] prices){
        this.stockName = stockName;
        this.stockSymbol = stockSymbol;
        this.prices = prices;
    }
    abstract int  findMaxPrice();
    abstract int findMinPrice();
    abstract double calculateAveragePrice();
    abstract int[] findLongestIncreasingTrend();
    abstract void displayAnalysis();

}
