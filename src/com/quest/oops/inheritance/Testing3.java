package com.quest.oops.inheritance;

public class Testing3 extends Testing2{
    public static void main(String[] args) {
        Testing1 test = new Testing3(2,3,"Robin",24);                                                                                                                                                                                                                                                             ;


    }
    int age ;
    Testing3(int a,int b, String name , int age){
        super(a,b,name);
        this.age = age;
    }
    public void display(){

//        super.test();
        System.out.println("this  is from testing 3");
    }
}
