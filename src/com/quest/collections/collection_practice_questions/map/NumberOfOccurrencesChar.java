package com.quest.collections.collection_practice_questions.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfOccurrencesChar {
    public static void main(String[] args) {
        String str = "HelloWorld";
        str = str.toLowerCase();
        String[] strArray = str.split("");
        Map<String , Integer> occ = new HashMap<>();
        for(int i = 0; i< strArray.length;i++){
            if (occ.containsKey(strArray[i])){
                occ.put(strArray[i] , occ.get(strArray[i])+1);
            }else {
                occ.put(strArray[i],1);
            }
        }
        for (Map.Entry<String,Integer>entry : occ.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
