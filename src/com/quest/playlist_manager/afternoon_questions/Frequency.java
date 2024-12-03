package com.quest.playlist_manager.afternoon_questions;

import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        int[] ell = new int[]{1, 2, 3, 3, 3};  //for storing the elements
        //here add  elements to the list
        for (int n : ell) {
            elements.add(n);
        }
        Map<Integer, List<Integer>> result = groupByFrequency(elements);  //calling the method and save the answer
        System.out.println(result);
    }
    //method for find the frequency
    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> elements) {
        Map<Integer, Integer> frequencyMap = new HashMap<>(); //to store the frequency
        for (int n : elements) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1); //finding the occurrences
        }

        Map<Integer, List<Integer>> answer = new HashMap<>(); //to store answer

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) { //here we get the map contents
            int frequency = entry.getValue();
            int number = entry.getKey();

            if (!answer.containsKey(frequency)) {
                answer.put(frequency, new ArrayList<>()); //if new create a list
            }

            answer.get(frequency).add(number); //otherwise it add to the list
        }

        return answer;
    }
}
