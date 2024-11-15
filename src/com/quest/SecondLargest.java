package com.quest;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] elements = new int[]{2, 4, 7, 8, 8};
        Arrays.sort(elements);
        byte i =1;
        while(true){
            if(elements[elements.length-i] == elements[elements.length-(i+1)]){
                i+=1;
            }
            else break;
        }
        System.out.println("second largest " + elements[elements.length-(i+1)]);
    }
}
