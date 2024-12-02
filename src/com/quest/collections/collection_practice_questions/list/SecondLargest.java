package com.quest.collections.collection_practice_questions.list;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        int[] elements1 = new int[]{1,2,3,4,5};
        for (int i : elements1){
            list1.add(i);
        }
        System.out.println(list1);
        list1.remove(list1.stream().max(Integer::compareTo).get());
        System.out.println("Second Largest elemet : "+ list1.stream().max(Integer::compareTo).get());
    }
}
