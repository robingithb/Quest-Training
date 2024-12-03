package com.quest.collections.collection_practice_questions.map;

import java.util.Comparator;
import java.util.Map;

public class SortByValuesStudent implements Comparator<Map.Entry<String,Integer>> {
//    private final Map<String, Integer> com;
//    public SortByValuesStudent(Map<String, Integer> baseMap) {
//        this.com = baseMap;
//    }



    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
