package com.quest.collections.collection_practice_questions.list;

import java.util.*;

public class ReverseWithoutInbuilt {
    public static void main(String[] args) {
        Stack<Integer> reverse = new Stack<>();
        int[] elements = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int a : elements) {
            reverse.push(a);
        }
        System.out.println("reversed order");
        while (!reverse.isEmpty()) {
            System.out.print(reverse.pop() + " ");
        }
    }
}
