package com.quest.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(3);
        h.add(2);
        h.add(5);
//        h.add(null);
      /*  for (int i : h){
            System.out.println("From Set " + i);
        }*/
      /*  ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(2);
        a.add(5);
        a.add(null);
        for (int i : a){
            System.out.println("From List " + i);
        }*/
        System.out.println("Size is : "+ h.size()); //find the size
        System.out.println("Checking empty or not : "+h.isEmpty());  //checking isEmpty or not
        System.out.println("checking contains : "+h.contains(2));    //checking for element
        System.out.println("removing 3 : "+h.remove(3));
        System.out.println(h);
        System.out.println();
        h.clear();
        System.out.println("cleared or not : "+h.isEmpty());

    }
}
