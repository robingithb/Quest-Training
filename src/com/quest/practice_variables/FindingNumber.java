package com.quest.practice_variables;

public class FindingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{6,2,8,5,1,3,9};
        boolean[] flag = new boolean[11];
        for (int num:arr){
            flag[num] = true;
        }
        for (int i = 0; i<=10 ;i++){
            if(!flag[i]){
                System.out.println(i);
            }
        }
    }
}
