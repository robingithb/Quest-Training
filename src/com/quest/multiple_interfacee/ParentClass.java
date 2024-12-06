package com.quest.multiple_interfacee;

public class ParentClass implements Interface1,Interface2{
    @Override
    public void method1() {
        System.out.println("method 1");
        Interface2.method2();
    }

    @Override
    public void defaultMethod() {
        Interface2.super.defaultMethod();
    }
}
