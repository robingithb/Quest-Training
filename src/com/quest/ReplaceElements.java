package com.quest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        int[] elements = new int[]{2, 4, 5, 7, 8};
        byte i = 0;
        int sum = 0;
        while (elements.length > i) {
            sum = sum + elements[i];
            i++;
        }
        for (i = 0; i < elements.length; i++) {
            elements[i] = sum - elements[i];
        }
        System.out.println(Arrays.toString(elements));
    }
}
