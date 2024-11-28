package com.quest.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DynamicAllocation {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();
        for(int i = 0;i<100;i++){
            linkedHashSet1.add(i);
        }
        System.out.println("from hash Set 1 ");
        for (int i :linkedHashSet1){
            System.out.print(i+" ");
        }


        TreeSet<Integer> treeSet1 = new TreeSet<>();
        for(int i = 0;i<100;i++){
            treeSet1.add(i);
        }
        System.out.println("\nfrom tree set 1 ");
        for (int i :treeSet1){
            System.out.print(i+" ");
        }

        LinkedHashSet<Integer>linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add(10);
        linkedHashSet2.add(30);
        linkedHashSet2.add(50);
        linkedHashSet2.add(70);
        linkedHashSet2.add(90);
        linkedHashSet2.add(20);
        linkedHashSet2.add(40);
        linkedHashSet2.add(60);
        linkedHashSet2.add(80);
        linkedHashSet2.add(100);
        System.out.println("\nfrom hash Set 2 ");
        for (int i :linkedHashSet2){
            System.out.print(i+" ");
        }

        TreeSet<Integer>treeSet2 = new TreeSet<>();
        treeSet2.add(10);
        treeSet2.add(30);
        treeSet2.add(50);
        treeSet2.add(70);
        treeSet2.add(90);
        treeSet2.add(20);
        treeSet2.add(40);
        treeSet2.add(60);
        treeSet2.add(80);
        treeSet2.add(100);

        System.out.println("\nfrom tree set 2 ");
        for (int i :treeSet2){
            System.out.print(i+" ");
        }
        LinkedHashSet<Integer>linkedHashSet3 = new LinkedHashSet<>();
        linkedHashSet3.add(10);
        linkedHashSet3.add(30);
        linkedHashSet3.add(50);
        linkedHashSet3.add(null);
        linkedHashSet3.add(90);
        linkedHashSet3.add(20);
        linkedHashSet3.add(null);
        linkedHashSet3.add(60);
        linkedHashSet3.add(80);
        linkedHashSet3.add(null);
        System.out.println("\nfrom hash Set 3 ");
        for (int i :linkedHashSet3){
            System.out.print(i+" ");
        }

        TreeSet<Integer>treeSet3= new TreeSet<>();
        treeSet3.add(10);
        treeSet3.add(30);
        treeSet3.add(50);
        treeSet3.add(null);
        treeSet3.add(90);
        treeSet3.add(20);
        treeSet3.add(null);
        treeSet3.add(60);
        treeSet3.add(80);
        treeSet3.add(null);

        System.out.println("\nfrom tree set 3 ");
        for (int i :treeSet3){
            System.out.print(i+" ");
        }
    }
}
