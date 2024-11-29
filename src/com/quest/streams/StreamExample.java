package com.quest.streams;

import java.util.ArrayList;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        //by using stream we can find the first element

        System.out.println(arrayList.stream().findFirst());  //it will return the first element
//        ArrayList<Integer>array = arrayList.stream().findFirst()
        System.out.println(arrayList.stream().findAny()); //return first element
        System.out.println(arrayList.stream().max(Integer :: compareTo).get());  //find the maximum element
        System.out.println(arrayList.stream().min(Integer :: compareTo).get());  //find the minimum element
        System.out.println(arrayList.stream().count()); // get the count
        System.out.println("Distinct :"+arrayList.stream().distinct().count());  //find distinct element count
        System.out.println("sun : "+arrayList.stream().reduce(Integer::sum).get());  //find the sum here
        System.out.println(arrayList.stream().filter(i -> i%2==0).toList());  //lambda function used ere also filter method
        //filter method filter this and return the stream,so it converted to list using .tolist
        System.out.println(arrayList.stream().map(i -> i*2 ).toList());
        //map used like filter its map we can manipulate with our conditions

        //here we map it with our condition and get sum using reduce
        System.out.println("Mul and Sum : "+arrayList.stream().map(i -> i*2 ).reduce(Integer::sum).get());
        System.out.println("Max and Sum : "+arrayList.stream().map(i -> i*2 ).max(Integer::compareTo).get());
        System.out.println("Min and Sum : "+arrayList.stream().map(i -> i*2 ).min(Integer::compareTo).get());





    }
}
