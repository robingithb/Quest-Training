package com.quest.playlist_manager.afternoon_questions;

import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        int[] ell = new int[]{1, 2, 2, 3, 3, 3};
        for (int n : ell) {
            elements.add(n);
        }
        Map<Integer, List<Integer>> result = groupByFrequency(elements);
        System.out.println(result);
    }

    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> elements) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : elements) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        Map<Integer, List<Integer>> answer = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            int number = entry.getKey();

            if (!answer.containsKey(frequency)) {
                answer.put(frequency, new ArrayList<>());
            }

            answer.get(frequency).add(number);
        }

        return answer;
    }
}
