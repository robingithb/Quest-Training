package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    int a ;
    int b;

    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);

        System.out.println(array);
        for (int a : array){
            System.out.println(a);
        }
        System.out.println(array.get(1)); //getting the element from particular index
       /* array.clear();  //it will clear the entire data
        System.out.println(array);*/
        array.remove(1);  //we can two types 1) index and 2) object also
        System.out.println(array);
        array.add(2);
        array.add(3);
        Iterator<Integer> iterator1 = array.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println(array.contains(1));
        System.out.println(array.isEmpty());


    }

}
