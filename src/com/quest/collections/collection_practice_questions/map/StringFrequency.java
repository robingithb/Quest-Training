package com.quest.collections.collection_practice_questions.map;

import java.util.*;

public class StringFrequency {
    public static void main(String[] args) {
        List<String> ele = new ArrayList<>();
        String[] str = new String[]{"apple","apple", "banana", "cherry", "banana", "banana"};
        int k = 2;
        for (String  s : str){
            ele.add(s);
        }
        Map<String,Integer> fr= new HashMap<>();
        List<String>ans = new ArrayList<>();
        for (String s : ele){
            fr.put(s,fr.getOrDefault(s,0)+1);
        }
        Map<Integer,String>set = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String,Integer>entry : fr.entrySet()){
           set.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Integer,String >entry : set.entrySet()){
            String sol = entry.getValue();
            if(entry.getKey()> k){
                ans.add(sol);
            }
        }
        System.out.println(ans);
    }
}
