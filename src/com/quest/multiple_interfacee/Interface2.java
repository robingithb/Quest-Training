package com.quest.multiple_interfacee;

public interface Interface2 {
    void method1();

    public static void method2() {
        System.out.println("static method");
    }

    default void defaultMethod() {
        System.out.println("Default method interface 2");
    }
}
