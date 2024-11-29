package com.quest.collections.hashmap;
import java.util.PriorityQueue;

import java.util.*;

public class PersonDrive {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person>personSet = new HashSet<>();
        Map<Integer,Person>personMap = new HashMap<>();
        PriorityQueue<Person>personQueue = new PriorityQueue<>();
        Person person1 = new Person(101,"Hanan","ekm",24);
        Person person2 = new Person(102,"Pranav","Idk",25);
        Person person3 = new Person(103,"Sidharth","Tvm",26);
        Person person4 = new Person(104,"Adithya","mla",27);
        Person person5 = new Person(105,"Leo","Tcr",28);
        Person person6 = new Person(106,"Devika","knr",19);
        Person[] personArray = new Person[]{person1,person2,person3,person4,person5,person6};
        int i = 1;
        for (Person p : personArray){
            personList.add(p);
            personMap.put(i,p);
            i++;
            personSet.add(p);
            personQueue.add(p);
        }
        ;
        System.out.println("LIST :" +personList);
        System.out.println("MAP :"+personMap);
        System.out.println("SET :"+personSet);
        System.out.println("QUEUE :"+personQueue);

        while (!personQueue.isEmpty()){
            System.out.println(personQueue.poll());
        }

    }
}
