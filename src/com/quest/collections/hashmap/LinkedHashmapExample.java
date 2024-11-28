package com.quest.collections.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lh = new LinkedHashMap<>();
        lh.put(1, "Apple");
        lh.put(2, "Grape");
        lh.put(3, "Banana");
        lh.put(4, "Watermelon");
        lh.put(5, "JackFruit");
        for (int i : lh.keySet()) {
            System.out.println("keys : " + i);
        }
        for (String str : lh.values()) {
            System.out.println("Values : " + str);
        }
        for (Map.Entry<Integer, String> map : lh.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

        //simple literate the value using forEach and lambda expressions
        System.out.println("using easy way like foreach");
        lh.forEach((key,value) -> {
            System.out.println(key +" "+value);
        });
        System.out.println("getting " + lh.get(3));
        System.out.println("Size  : " + lh.size());
        System.out.println("getting using values " + lh.get("Grape"));
        System.out.println("removing :" + lh.remove(3));
        System.out.println(lh);
//        lh.clear();
        System.out.println("after clear empty or not " + lh.isEmpty());
        System.out.println(lh.entrySet());
        System.out.println("contains value or not : " + lh.containsValue("Grape"));
        System.out.println("contains key or not : " + lh.containsKey(2));


    }
}

