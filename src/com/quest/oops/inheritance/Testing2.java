package com.quest.oops.inheritance;

public class Testing2 extends Testing1{
    String name;

    Testing2(int a, int b ,String name){
        super(a,b);
        this.name = name;
    }
    public void test(){
        super.test();
        System.out.println("This is from Testing2");
    }


}
