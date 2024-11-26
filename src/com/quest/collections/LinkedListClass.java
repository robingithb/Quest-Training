package com.quest.collections;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        list.add("robin");
        list.add("ro");
        list.add("bin");
        list.add("robi");
        list.add("robin Thomas");
        list.add(5,"Thomas");
        list.addFirst("thasni"); // we can add first in the linked list ,like we have another method addLast() for last;
        list.addLast("Ammu");
        for (String name : list){
            System.out.println(name);
        }
        System.out.println(list.getFirst());
        System.out.println(list.get(2));
//        System.out.println(list.removeFirst());  //like remove first and last and particular index also
        System.out.println(list.size());  //get the size of the linkedlist and arraylist
        System.out.println(list.contains("Ammu")); // contains check the element present or not
        System.out.println(list.isEmpty());

    }
}
