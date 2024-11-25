package com.quest.practice_variables;

import java.util.Arrays;

public class PracticeTest {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5};
//       for(int i  : arr){
//           System.out.println(i);
//       }
        int[][] arr = new int [][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i = arr.length-1;i>=0;i--) {
            for (int j = arr[i].length-1; j >= 0; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }





    }
}
