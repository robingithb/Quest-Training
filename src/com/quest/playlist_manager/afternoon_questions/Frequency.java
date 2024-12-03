package com.quest.playlist_manager.afternoon_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        List<Integer>elements = new ArrayList<>();
        int[] ell =  new int[]{1,2, 2, 3, 3, 3};
        for (int n : ell){
            elements.add(n);
        }
        Map<Integer,List<Integer>>result = groupByFrequency(elements);
        System.out.println(result);

    }
    public  static Map<Integer,List<Integer>> groupByFrequency(List<Integer>elements){
        long num;
        Map<Integer,Integer>result = new HashMap<>();
        for (int n : elements){
            result.put(n, result.getOrDefault(n, 0) + 1);
        }
        Map<Integer, List<Integer>> answer = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            answer.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
    return answer;
    }
}
