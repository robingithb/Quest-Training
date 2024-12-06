package com.quest.competativecoding;

public class SquareStar {
    public static void main(String[] args) {
        int rowSize = 5;
        int columnSize = 4;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (i == 0 || i == rowSize - 1|| j == 0 || j == columnSize-1) {
                    System.out.print(" * ");
                } else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
