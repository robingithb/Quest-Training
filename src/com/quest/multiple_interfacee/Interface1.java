package com.quest.multiple_interfacee;

public interface Interface1 {
    void method1();
    public static void method2() {
        System.out.println("static method interface 1");
    }

    default void defaultMethod() {
        System.out.println("Default method interface 1");
    }
}
