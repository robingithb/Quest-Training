package com.quest.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.forEach(System.out::println);

//        Iterator<Integer>it = pq.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        PriorityQueue<String>pq2 = new PriorityQueue<>();
//        pq2.add("a");
////        pq2.add(null);
//        pq2.add("r");
//        pq2.add("t");
//        pq2.forEach(System.out::println);
        System.out.println("peek element : " +pq.peek()); //find the top element

        System.out.println("After");
       pq.poll(); //removing the element
        pq.forEach(System.out::println);
        System.out.println("remove:"+pq.remove()); //also removing
        pq.forEach(System.out::println);


    }
}
