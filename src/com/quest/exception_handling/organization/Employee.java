package com.quest.exception_handling.organization;

import java.lang.reflect.InaccessibleObjectException;

public class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name , int age , double salary) throws InvalidInputException {
        setName(name);
        setAge(age);
        setSalary(salary);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidInputException {
        if (age < 18) {
            throw new InvalidInputException("Age is less than 18", age);
        } else {
            this.age = age;
        }
    }

    public void setSalary(double salary) throws InvalidInputException {
        if(salary < 0){
            throw new InvalidInputException("salary should not be negative",salary);
        }
        else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Name : "+name + "\nAge : "+age +"\nSalary : "+salary;
    }

    public final void display(){
        System.out.println(this);
    }
}
