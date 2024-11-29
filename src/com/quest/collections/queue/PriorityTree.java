package com.quest.collections.queue;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityTree {
    public static void main(String[] args) {
        PriorityQueue<Integer>p= new PriorityQueue<>();
        TreeSet<Integer>t = new TreeSet<>();
        int[] a = new int[]{2,7,4,1,8};
        for(Integer i :a){
            p.add(i);
            t.add(i);
        }
//        t.add(null);
//        t.add(null);
//       p.add(null);
        System.out.println("priority Queue");
        p.forEach(System.out::println);
        System.out.println("set tree");
        t.forEach(System.out::println);
    }
}
