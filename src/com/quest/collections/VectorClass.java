package com.quest.collections;


import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
        System.out.println(vector.get(1));
        System.out.println(vector.contains(2));
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }
}
