package com.quest.collections.collection_practice_questions.set;

import java.util.HashSet;
import java.util.Set;

public class EqualCheck {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>();
        int[] elements1 = new int[]{1,2,3,4,5};
        int[] elements2 = new int[]{1,2,3,4,5,6,7,8};
        for (int i : elements1){
            set1.add(i);
        }
        for (int i : elements2){
            set2.add(i);
        }

        if (set1.equals(set2)){
            System.out.println("set 1 and set 2 are equal");
        }else System.out.println("Not equal");
        Set<Integer>tempSet2 = new HashSet<>();
        tempSet2.addAll(set1);
        tempSet2.removeAll(set2);
       if (tempSet2.isEmpty()){
           System.out.println("set 2 contains all the elements of set 1 ");
       } else System.out.println("set 2 not equal and its not contain");
        }
    }

