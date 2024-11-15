package com.quest.oops.test1;

import com.quest.oops.AbstractionExamples;

public class Drive  extends AbstractClassExamples {

    public static void main(String[] args) {

        Drive drive = new Drive();
        drive.drive();
         drive.add();
    }
    @Override
    public void drive() {
        System.out.println("Abstract class");
    }
    public  void add(){
        System.out.println("add method from drive class");
    }
}
