package com.quest.competativecoding;

import java.util.ArrayList;
import java.util.List;

public class SameElementOrNot {
    public static void main(String[] args) {
        List<Integer>array1 = new ArrayList<>();
        List<Integer>array2 = new ArrayList<>();
        int[] elements = new int[]{1,2,3,4,5,6};
        for (int i : elements){
            array1.add(i);
            array2.add(i);
        }
        boolean flag = false;
        if (array1.size() == array2.size()){
            for (int i = 0;i<array1.size();i++){
                if (!array1.contains(array2.get(i))){
                    flag = true;
                }
            }
        }
        if (flag){
            System.out.println("elements are changed");
        }else System.out.println("its contain all elements");

    }
}
