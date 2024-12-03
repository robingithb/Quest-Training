package com.quest.playlist_manager.afternoon_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        int[] ele = new int[]{1, 2, 3, 4, 5, 6}; //elements to enter the list
        List<Integer>list = new ArrayList<>();
        //adding the elements
        for (int i : ele){
            list.add(i);
        }
        int length=2; // te range of partitioning
        List<List<Integer>>result = findPartition(list , length);
        System.out.println(result);

    }
    //here it partitions occur
    public static List<List<Integer>> findPartition(List<Integer>list ,int length){
        List<Integer>intermediate = new ArrayList<>(); //storing the intermediate answer
        List<List<Integer>>result = new ArrayList<>(); // store the result


        for (int i = 0; i < list.size(); i++) {
            intermediate.add(list.get(i));
            if (intermediate.size() == length) {
                result.add(new ArrayList<>(intermediate));
                intermediate.clear(); //clearing the intermediate
            }
        }
        if (!intermediate.isEmpty()) { //if any last elements there
            result.add(intermediate);
        }
        return result;
    }
}
