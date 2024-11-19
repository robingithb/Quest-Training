package com.quest.oops.interfaces;

public class Result implements InterfaceA,InterfaceB{

    @Override
    public void add() {
        System.out.println("Interface A add method");
    }

    @Override
    public void add1() {
        System.out.println("Interface B add1 method");
    }

    @Override
    public void sub() {
        System.out.println("Interface B sub method");
    }

    public static void main(String[] args) {
        Result res = new Result();
        System.out.println("from result");
        res.add();
        res.add1();

    }
}
