package com.quest.collections;

import com.quest.collections.hashmap.Person;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.PriorityQueue;

public class SortingMainDrive {
    public static void main(String[] args) {
        PriorityQueue<SortingExample> person = new PriorityQueue<>();
        SortingExample person1 = new SortingExample(101,"Hanan","ekm",24);
        SortingExample person2 = new SortingExample(105,"Pranav","Idk",25);
        SortingExample person3 = new SortingExample(103,"Sidharth","Tvm",26);
        SortingExample person4 = new SortingExample(106,"Adithya","mla",27);
        SortingExample person5 = new SortingExample(104,"Leo","Tcr",28);
        SortingExample person6 = new SortingExample(102,"Devika","knr",19);
        SortingExample[] personArray = new SortingExample[]{person1,person2,person3,person4,person5,person6};

        for (SortingExample p : personArray){
            person.add(p);
        }
        System.out.println("priority Queue");
        while(!person.isEmpty()){
            SortingExample per = person.poll();
            System.out.println(per.display());
//            System.out.println(person.poll());
        }
     }
}
