package com.quest.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExamples {
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("Hello");
        a.add("hai");
        a.add("Namasthe");
        for (String str : a){
            System.out.println(str);
        }
        System.out.println("removing " +a.remove("Hello"));
        System.out.println("after removing " +a);
        System.out.println("contains "+a.contains("hai"));
        System.out.println("checking for empty " +a.isEmpty());
        System.out.println("size  "+ a.size());
//        a.clear();
        System.out.println("after clear " +a.isEmpty());
        Iterator<String>it = a.iterator();
        while (it.hasNext()){
            System.out.println("from iterator : "+it.next());
        }
    }
}
