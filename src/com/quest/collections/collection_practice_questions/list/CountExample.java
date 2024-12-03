package com.quest.collections.collection_practice_questions.list;

import java.util.HashMap;
import java.util.Map;

public class CountExample {
    public static void main(String[] args) {
        String str = "Java is fun and java is powerful";  //consider it lower case
        str = str.toLowerCase();
        String[] strArray = str.split(" ");
        Map<String,Integer> counts = new HashMap<>();
        for (String s : strArray){
            if(counts.containsKey(s)){
                counts.put(s,counts.get(s)+1);
            }else {
                counts.put(s,1);
            }
        }
        System.out.println("Counts");
        counts.forEach((String,Integer)->{
            System.out.println(String +" : "+ Integer);
        });

    }
}
