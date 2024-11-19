package com.quest;

import java.util.Arrays;

public class Pairing {
    public static void main(String[] args) {
        int[] numbers = {10, 10, 10, 20, 30, 20, 50, 40, 40, 30, 30, 10};
        Arrays.sort(numbers);
        byte count = 0;
        int currentValue = numbers[0];
        boolean flag = false;
        //to get count of each pair
        for (byte i = 0; i < numbers.length; i++) {
            if (currentValue == numbers[i]) {
                count++;
                continue;
            }
            //printing the number of pair
            System.out.println(currentValue + "'s - " + count / 2);
            currentValue = numbers[i];
            i -= 1;
            count = 0;
        }
    }
}
