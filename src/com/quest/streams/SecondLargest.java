package com.quest.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,33,33,32,4,5,6,7);
        System.out.println(list);
//        list.stream().max((i1,i2)->i1>i2?1:-1).get();
//
 //find second largest using stream it's not remove the elements,if there is duplicate so we use distinct
        System.out.println(list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get());

    }
}
