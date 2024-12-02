package com.quest.collections.collection_practice_questions.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        Map<Integer, String> emp = new HashMap<>();
        emp.put(101, "Robin");
        emp.put(102, "Jibin");
        emp.put(103, "Navaneeth");
        emp.put(104, "Amaljith");
        emp.put(105, "Sharan");
        emp.put(106, "Athul");
        emp.put(107, "Ajil");
        emp.put(108, "Shijil");
        emp.put(109, "Deepak");
        emp.put(110, "Agustin");
        emp.put(111, "Akash");
        Scanner sc = new Scanner(System.in);
        int id;
        while (true) {
            System.out.println("Enter the emp id");
            id = sc.nextInt();
            if (emp.get(id) != null) {
                System.out.println(emp.get(id));
            } else {
                System.out.println("id not found");
            }
            System.out.println("enter 1 for stop..!");
            int i = sc.nextInt();
            if (i == 1) {
                break;
            }
        }
    }
}
