package com.quest.practice_variables;

import java.util.Scanner;

public class MatrixExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixExamples matrixExamples = new MatrixExamples();
//        int[][] matrix = new int[3][3];
//        System.out.println("Enter the Matrix");
//       for (int i = 0 ; i < matrix.length ; i++){
//            for (int j =0; j< matrix[i].length; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        for(int[] m: matrix){
//            System.out.print("\n");
//            for(int x : m){
//                System.out.print(x +"\t");
//            }
//        }
////        for (int i = 0 ; i < matrix.length ; i++){
////            System.out.print("\n");
////            for (int j =0; j< matrix[i].length; j++){
////                System.out.print(matrix[i][j]+"\t");
////            }
////        }
//        System.out.println("Enter the value for search");
//        int value = sc.nextInt();
//        int[] ans = matrixExamples.matrixSearch(matrix,value);
//        if(ans[0]!= -1 && ans[1]!= -1){
//            System.out.println("Got it... index is "+ans[0]+ " " +ans[1]);
//        }
//        else {
//            System.out.println("not found");
//        }
        System.out.println("enter the array");
        int[] x = new int[6];
        for (int i = 0;i<5;i++){
            x[i] = sc.nextInt();
        }
        x = matrixExamples.sortArray(x);
        matrixExamples.printArray(x);


        }
        private int[]  matrixSearch(int[][] matrix , int value){
            for (int i = 0 ; i < matrix.length ; i++){
                for (int j =0; j< matrix[i].length; j++){
                    if(matrix[i][j] == value){
                        return new int[]{i,j};

                    }
                }
            }
            return new int[]{-1,-1};
        }
        private int[]  sortArray(int[] x){
        for(int i =0;i< x.length;i++){
            for(int j =i;j<x.length-1;j++){
                if(x[j]>x[j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1]= temp;
                }
            }
        }
        return x;
        }
        private void printArray(int[] x){
            System.out.println("sorted array");
        for(int i = 0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        }
    }

