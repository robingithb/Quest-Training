package com.quest.collections.collection_practice_questions.set;

import java.util.HashSet;
import java.util.Set;

public class FindUID {
    public static void main(String[] args) {
        Set<Integer>set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>();
        int[] elements1 = new int[]{1,2,3,4,5};
        int[] elements2 = new int[]{4,5,6,7,8,9};
        for (int i : elements1){
            set1.add(i);
        }
        for (int i : elements2){
            set2.add(i);
        }
        union(set1,set2);
       interception(set1,set2);
       difference(set1,set2);

    }
    public static void union( Set<Integer>set1 ,  Set<Integer>set2){
        Set<Integer>tempSet2 = new HashSet<>();
        tempSet2.addAll(set1);
        System.out.println("Union");
        tempSet2.addAll(set2);
        System.out.println(tempSet2);
    }
    public static void interception(Set<Integer>set1 ,  Set<Integer>set2){
        Set<Integer>tempSet2 = new HashSet<>();
        tempSet2.addAll(set1);
        System.out.println("Interception");
        for (Integer i : set2){
            if(!tempSet2.add(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void difference(Set<Integer>set1 ,  Set<Integer>set2) {
        Set<Integer>tempSet2 = new HashSet<>();
        System.out.println("\nDifference");
        tempSet2.addAll(set1);
        tempSet2.removeAll(set2);
        System.out.println(tempSet2);
    }
}
