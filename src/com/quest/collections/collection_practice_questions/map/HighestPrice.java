package com.quest.collections.collection_practice_questions.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestPrice {
    public static void main(String[] args) {
        Map<String,Integer> products = new HashMap<>();
        products.put("Glass",200);
        products.put("Ball",500);
        products.put("Mobile",20000);
        products.put("Pillow",100);
        products.put("Frame",350);
        products.put("Keyboard",800);
        int highest = 0;
        String highestProductName = null;
        for (Map.Entry<String,Integer> entry : products.entrySet()){
            if(highest < entry.getValue()){
                highest = entry.getValue();
                highestProductName = entry.getKey();
            }
        }
        System.out.println("Highest : "+highestProductName +" "+highest);
    }
}
