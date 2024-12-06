package com.quest.consumer;

import com.quest.case_studies.telecom_subscriber_management_system.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CPSExample {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (Integer i : numbers){
            list.add(i);
        }
        Predicate<Integer>filter = (integer ->
            integer % 2 == 0
        );
        Consumer<Integer>transform = (integer ->{
            System.out.println(integer*2);
        });
        Supplier<List<Integer>> transformedList = ()->{
           List<Integer>answerList = new ArrayList<>();
           for(Integer number : numbers){
               if (filter.test(number)){
                   answerList.add(number);
               }

           }
           return answerList;
        };
        list = transformedList.get();
        list.forEach(i ->{
            transform.accept(i);
        });


    }
}
