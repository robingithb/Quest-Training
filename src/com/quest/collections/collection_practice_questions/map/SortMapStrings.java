package com.quest.collections.collection_practice_questions.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapStrings {
    public static void main(String[] args) {
        TreeMap<Integer,String>sorted = new TreeMap<>();
        Map<Integer,String>nonSorted = new LinkedHashMap<>();
        nonSorted.put(2,"Robin");
        nonSorted.put(3,"Thasni");
        nonSorted.put(4,"Edwin");
        nonSorted.put(1,"Sharon");
        nonSorted.put(6,"Aljo");
        nonSorted.put(5,"Anjitha");

        System.out.println("before sort");
        nonSorted.forEach((key,name) -> System.out.println(key + " "+ name));
        sorted.putAll(nonSorted);
        System.out.println("\nAfter sorted");
        sorted.forEach((key,name) -> System.out.println(key + " "+ name));
    }

}
