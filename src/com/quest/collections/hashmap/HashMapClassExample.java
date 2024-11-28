package com.quest.collections.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapClassExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Robin");
        hashMap.put(3,"thasni");
        hashMap.put(4,"Anupama");
        hashMap.put(2,"maya");
        for (String str :hashMap.values()){
            System.out.println(str);
        }
        for (int k : hashMap.keySet()){
            System.out.println(k);
        }
        //how to get values from hashmap
        for (Map.Entry<Integer , String>a : hashMap.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());

        }
        System.out.println("getiing using key : "+ hashMap.get(2));
        System.out.println("getiing using value : "+ hashMap.get("thasni")); //it will null only accept the key
        hashMap.remove(2); //remove the pair
        System.out.println(hashMap);
        System.out.println("size : "+hashMap.size());  //get the size
        System.out.println("empty or not : "+hashMap.isEmpty());
        System.out.println("clearing : ");
        hashMap.clear();
        System.out.println("empty or not : "+hashMap.isEmpty());


    }
}
