package com.quest.exception_handling;

import java.util.Scanner;

public class ErrorClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice 1 for stackOverFlow and anything for outOfMemory");
        if(sc.nextInt() == 1) {
            try {
                causeStackOverFlow();

            } catch (StackOverflowError s) {
                s.printStackTrace();
            }
        }else{
            try{
                causeOutOfMemory();
            }catch (OutOfMemoryError o ){
                o.printStackTrace();
            }
        }

    }

    public static void causeStackOverFlow(){
        while(true){
            causeStackOverFlow();
        }
    }
    public static  void causeOutOfMemory(){
        int amount = 10;
        final int max = 1000000000;
        while(amount > 0){
            int[] arr = new int[max];
            for(int i = 0; i<amount ; i++){
                arr[i]  = i+i;
            }
            System.out.println("amount : "+amount);
            amount -= 1;
        }
    }
}
