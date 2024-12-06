package com.quest.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainDrive {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("John");
        Person person2 = new Person("Jasim");
        Person person3 = new Person("Paul");
        Person person4 = new Person("Sia");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        //we just need one interface and consumer and use like anything
        PersonConsumer printUpperCase = (person -> {  //here calling the name of the interface
            System.out.println(person.getName().toUpperCase());
        });

        Consumer<Person> findLength = (person -> { //here calling with consumer both are same
            System.out.println("length : " + person.getName().length());
        });
        //here using predicate now
        Predicate<Person> minimumLength = (person ->{
            if (person.getName().length() >= 4 ){
               return true;
            }else return false;
        });
        boolean ans;
        list.forEach(person -> {
            printUpperCase.accept(person);
            System.out.println("length will be");
            findLength.accept(person);
            if(minimumLength.test(person)){
                System.out.println(person.getName()+" has minimum length");
            }
            else System.out.println(person.getName()+" hasn't minimum length");
        });

    }
}
