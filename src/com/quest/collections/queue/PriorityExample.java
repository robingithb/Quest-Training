package com.quest.collections.queue;

import java.util.PriorityQueue;

public class PriorityExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        PriorityQueue<String> s = new PriorityQueue<>();
        PriorityQueue<Boolean> b = new PriorityQueue<>();
        PriorityQueue<Double> d = new PriorityQueue<>();
        PriorityQueue<Float> f = new PriorityQueue<>();


        // using integer
        p.add(1);
        p.add(4);
        p.add(3);
        p.add(100);
        p.add(50);
        System.out.println("Integer");
        while (!p.isEmpty()){
            System.out.println(p.peek());
            p.poll();
        }
        //adding String
        s.add("Veera");
        s.add("Laya");
        s.add("Maya");
        s.add("Aparna");
        s.add("Catherine");
        System.out.println("\nStrings");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.poll();
        }
        //adding boolean
        b.add(true);
        b.add(false);
        b.add(false);
        b.add(false);
        b.add(true);
        System.out.println("\nBoolean");
        while (!b.isEmpty()){
            System.out.println(b.peek());
            b.poll();
        }
        //adding double
        d.add(100.00);
        d.add(30.00);
        d.add(50.00);
        d.add(10.25);
        d.add(55.33);
        System.out.println("\nDouble");
        while (!d.isEmpty()){
            System.out.println(d.peek());
            d.poll();
        }
        //float
        f.add(1.0F);
        f.add(30.00F);
        f.add(50.00F);
        f.add(10.25F);
        f.add(55.33F);
        System.out.println("\nFloat");
        while (!f.isEmpty()){
            System.out.println(f.peek());
            f.poll();
        }

    }
}
