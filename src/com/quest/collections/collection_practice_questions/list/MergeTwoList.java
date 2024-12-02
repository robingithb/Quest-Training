package com.quest.collections.collection_practice_questions.list;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2  = new ArrayList<>();
        int[] elements1 = new int[]{1,2,3,4,5};
        int[] elements2 = new int[]{4,5,6,7,8,9};
        for (int i : elements1){
            list1.add(i);
        }
        for (int i : elements2){
            list2.add(i);
        }
        System.out.println("List 1 : "+list1+" List 2 : "+list2);
        for (Integer integer : list2) {
            if (!list1.contains(integer)) {
                list1.add(integer);
            }
        }
        System.out.println("Merged : "+list1);
    }
}
