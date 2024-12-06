package com.quest.competativecoding;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] elements = new int[]{1,2,3,4,5};

        for (int i = 0;i<elements.length-1;i+=2){
            int temp = elements[i+1];
            elements[i+1] = elements[i];
            elements[i] = temp;
        }
        System.out.println(Arrays.toString(elements));
    }
}
