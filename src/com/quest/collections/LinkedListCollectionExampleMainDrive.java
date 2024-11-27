package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollectionExampleMainDrive {
    public static void main(String[] args) {
        LinkedList<LinkedListCollectionExample> list = new LinkedList<>();

        //adding to the linked list
        list.add(new LinkedListCollectionExample(101,"Diya","Tcr"));
        list.add(new LinkedListCollectionExample(102,"Maya","TN"));
        list.add(new LinkedListCollectionExample(103,"Amrutha","KK"));
        list.add(new LinkedListCollectionExample(104,"Janvi","KKr"));
        list.add(new LinkedListCollectionExample(105,"Anu","Tvm"));
        list.add(new LinkedListCollectionExample(106,"Hanan","Ekm"));

        //adding particular index
        list.add(3,new LinkedListCollectionExample(108,"Anupama","Cok"));

         //displaying using iterator
        Iterator<LinkedListCollectionExample> iterator = list.iterator();
        while(iterator.hasNext()){
            LinkedListCollectionExample person = iterator.next();
            System.out.println("\nId No : "+person.getId() +
                    "\nName : "+person.getName() +
                    "\nLoation : "+person.getLocation());
        }

        LinkedListCollectionExample person;
        //adding to first of the linked list
        list.addFirst(new LinkedListCollectionExample(100, "Thasni","Tcr"));
        //adding to the end of linked list
        list.addLast(new LinkedListCollectionExample(107,"shiji","Mal"));
        person = list.getFirst();
        System.out.println("\nFirst and last");
        System.out.println("Id No : "+person.getId() +
                "\nName : "+person.getName() +
                "\nLoation : "+person.getLocation());
        person = list.getLast();
        System.out.println("\nId No : "+person.getId() +
                "\nName : "+person.getName() +
                "\nLoation : "+person.getLocation());

        //finding the size
        System.out.println("\nSize of the linked list : "+ list.size());

        //checking linked list using contains
        boolean flag = false;
        for(LinkedListCollectionExample person1 : list){
            if(person1.getName().contains("Anupama")){
                flag = true;
            }
        }
        if (flag){
            System.out.println("Anupama contains true");
        }

        //last index person
        LinkedListCollectionExample lastMan = new LinkedListCollectionExample(110,"SreeDevi","KK");
        list.add(lastMan);
        System.out.println("last index of (occurance) lastMan is : "+list.lastIndexOf(lastMan));
        LinkedListCollectionExample personFirst = list.getFirst();
        LinkedListCollectionExample personLast = list.getLast();
        LinkedListCollectionExample personIndex = list.get(3);
        System.out.println("\nbefore removing first man,last man and index 3 will be : "+personFirst.getName() +" "+ personLast.getName()+" "+personIndex.getName());
        list.removeFirst();
        list.removeLast();
        list.remove(3);
        personFirst = list.getFirst();
        personLast = list.getLast();
        personIndex = list.get(3);

        System.out.println("\nAfter removing first man,last man and index 3 will be : "+personFirst.getName() +" "+ personLast.getName()+" "+personIndex.getName());
        //isEmpty or not
        System.out.println("List empty or not : "+list.isEmpty());
        //clearing the list
        list.clear();
        System.out.println("after clear, List empty or not : "+list.isEmpty());



    }
}
