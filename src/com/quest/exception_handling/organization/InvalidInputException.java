package com.quest.exception_handling.organization;

public class InvalidInputException extends Exception{

    private int age ;
    private double salary;
    public InvalidInputException(String message,int age){
        super(message);
        this.age = age;
    }
    public InvalidInputException(String message,double salary){
        super(message);
        this.salary = salary;
    }

}
