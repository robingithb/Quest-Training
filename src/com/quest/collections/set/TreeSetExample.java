package com.quest.collections.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(3);
        t.add(2);
        t.add(5);
        System.out.println(t);
        System.out.println("first element : "+t.first());
        System.out.println("last element : "+t.last());
        System.out.println("descending order : " +t.descendingSet());

        //floor returning the key of the element
        /*System.out.println(t.floor(1));
        System.out.println(t.floor(3));
        System.out.println(t.floor(10));*/
        System.out.println("ascending order : "+t.headSet(5,true)); //ascending to particular element
        System.out.println("ascending order : "+t.headSet(t.size(),true)); //not properly ascending order to particular element //check it some problems


    }

}
