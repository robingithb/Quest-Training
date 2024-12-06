package com.quest.streams.employye;

public class Employee {
    private int empId;
    private String empName;
    private int age;
    private String dept;
    private double salary;
    private int year;

    public Employee(int empId,  String empName,int age, String dept, double salary, int year) {
        this.empId = empId;
        this.age = age;
        this.empName = empName;
        this.dept = dept;
        this.salary = salary;
        this.year = year;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public int getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", year=" + year +
                '}';
    }
    public  void display(){
        System.out.println(this.toString());
    }
}
