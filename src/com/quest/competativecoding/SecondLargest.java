package com.quest.competativecoding;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        int[] elements = new int[]{1,2,3,4,5,6};
        for (int i : elements){
            list.add(i);
        }
        System.out.println(list);
        list.remove(list.stream().max(Integer::compareTo).get());
        System.out.println("Second largest is : "+list.stream().max(Integer::compareTo).get());
    }
}
