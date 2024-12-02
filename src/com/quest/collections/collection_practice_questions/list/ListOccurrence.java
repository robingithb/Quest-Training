package com.quest.collections.collection_practice_questions.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOccurrence {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        int[] elements1 = new int[]{1, 2, 3, 4, 5, 5, 4, 4, 2, 1};
        for (int i : elements1) {
            list1.add(i);
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            if (count.containsKey(list1.get(i))) {
                count.put(list1.get(i), count.get(list1.get(i)) + 1);
            }else {
                count.put(list1.get(i),1);
            }
        }
        System.out.println("Occurrences");
        count.forEach((key,value)->{
            System.out.println(key +" : "+value);
        });
    }
}
