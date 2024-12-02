package com.quest.collections.collection_practice_questions.set;

import java.util.*;

public class DuplicateString {
    public static void main(String[] args) {
        List<String>elements = new ArrayList<>();
        elements.add("Robin");
        elements.add("Pranav");
        elements.add("Hanan");
        elements.add("Hanan");
        elements.add("Sidharth");
        elements.add("Sidharth");
        elements.add("Amritha");
        elements.add("Robin");
        elements.add("Sheril");
        elements.add("Adhitya");
        Set<String>names = new TreeSet<>();
        for (String str : elements){
            names.add(str);
        }
        names.forEach(name-> System.out.println(name));

    }
}
