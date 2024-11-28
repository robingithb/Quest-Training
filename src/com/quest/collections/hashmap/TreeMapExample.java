package com.quest.collections.hashmap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String,String>tm = new TreeMap<>();
        tm.put("Hello","English");
        tm.put("Namste","Hindi");
        tm.put("Ambu","Tamil");
        tm.put("Cheppu","Kannada");
        tm.put("Amma","Malayalam");

        tm.forEach((key, value) ->{
            System.out.println(key+" "+value);
        });
        tm.replace("Amma","Malay");
        System.out.println(tm);

        TreeMap<Integer,String>tm2 = new TreeMap<>();
        tm2.put(1,"English");
        tm2.put(3,"Hindi");
        tm2.put(4,"Tamil");
        tm2.put(2,"Kannada");
        tm2.put(5,"Malayalam");
        tm2.forEach((key, value) ->{
            System.out.println(key+" "+value);
        });

        System.out.println("getting  : "+  tm2.get(3));
        //using key
        System.out.println(tm2.ceilingEntry(3).getValue());

    }
}
