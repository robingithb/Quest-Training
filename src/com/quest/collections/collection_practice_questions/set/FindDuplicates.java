package com.quest.collections.collection_practice_questions.set;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,1,2,3};
        Set<Integer>duplicates = new HashSet<>();
        for (int a : array){
            if (!duplicates.add(a)){
                System.out.println("first duplicate  : "+a);
                break;
            }
        }
    }
}
