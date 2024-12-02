package com.quest.collections.collection_practice_questions.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        int[] elements1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : elements1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        set2 = set1.stream().filter(i -> i % 3 == 0).collect(Collectors.toSet());
        set1.removeAll(set2);
        System.out.println(set1);
    }
}

