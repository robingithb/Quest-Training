package com.quest.oops.test;

public class TestExample {
    int rollNo;
    String name;
    String address;

    TestExample(int rollNo,String name , String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "roll no : "+rollNo +"\n Name : "+name+"\n Address : "+address ;
    }
    public void display(){
        System.out.println(this.toString());
    }
}
