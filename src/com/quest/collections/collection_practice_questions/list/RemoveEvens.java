package com.quest.collections.collection_practice_questions.list;

import java.util.ArrayList;
import java.util.List;


public class RemoveEvens {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] elements = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int a : elements) {
            list.add(a);
        }
        for (int i = 0;i<list.size();i++){
            if (list.get(i)%2 == 0){
                list.remove(i);
            }
        }
        System.out.println("Updated list : "+list);
    }
}
