package com.quest.streams.employye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMainDrive {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee employee1 = new Employee(101, "Robin", 24, "It", 30000, 2);
        Employee employee2 = new Employee(102, "Habi", 25, "sales", 20000, 1);
        Employee employee3 = new Employee(103, "Ravi", 20, "marketing", 22000, 2);
        Employee employee4 = new Employee(104, "Sonu", 24, "hr", 30000, 3);
        Employee employee5 = new Employee(105, "Abhi", 29, "it", 36000, 4);
        Employee employee6 = new Employee(106, "Jaik", 30, "Account", 45000, 5);
        Employee[] emp = new Employee[]{employee1,employee2,employee3,employee4,employee5,employee6};
        empList.addAll(Arrays.asList(emp));  //add all the emp

        //Sorting employees based on salary or experience.
        List<Employee> sortlist = empList.stream()
                .sorted(Comparator.comparing(employee -> employee.getYear()))
                .toList();
        System.out.println(sortlist);
        System.out.println("----------------------");

//        Filtering employees by specific criteria such as department or salary range
        List<Employee> filterlist = empList.stream().filter(employee ->employee.getSalary()>30000).toList();
        filterlist.forEach(System.out::println);
        System.out.println("----------------------");
//        double MaxSalary =  (double)empList.stream()
//                .max((e1,e2)->e1.getSalary()> e2.getSalary()?1:-1).get();
//        System.out.println(MaxSalary);
        System.out.println("----------------------");
    }
}
