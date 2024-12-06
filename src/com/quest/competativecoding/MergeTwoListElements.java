package com.quest.competativecoding;

import java.util.*;

public class MergeTwoListElements {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>();
        List<Integer>array2 = new ArrayList<>();
        int[] elements1 = new int[]{1,2,3,4,5,6};
        int[] elements2 = new int[]{5,6,7,8,9,10};
        for (int i : elements1){
            array1.add(i);
        }
        for (int i : elements2){
            array2.add(i);
        }
        Set<Integer> merged = new TreeSet<>();
        merged.addAll(array1);
        merged.addAll(array2);
        System.out.println(merged);
    }
}
