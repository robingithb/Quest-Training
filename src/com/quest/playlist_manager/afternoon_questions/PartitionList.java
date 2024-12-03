package com.quest.playlist_manager.afternoon_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        int[] ele = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer>list = new ArrayList<>();

        for (int i : ele){
            list.add(i);
        }
        int p=2;
        List<Integer>intermediate = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            intermediate.add(list.get(i));
            if (intermediate.size() == p) {
                result.add(new ArrayList<>(intermediate));
                intermediate.clear();
            }
        }
        if (!intermediate.isEmpty()) {
            result.add(intermediate);
        }
        System.out.println(result);

    }
}
