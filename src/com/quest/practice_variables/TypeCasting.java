package com.quest.practice_variables;

public class TypeCasting {
    public static void main(String[] args) {
        //implicit
        int a = 5;
        double b = a;
        System.out.println(b);
        //explicit
        double c = 7.8;
        int d = (int) c;
        System.out.println(d);


        int b1 = 129;
        byte a1 = (byte) b1;
        System.out.println(a1); //range -128  to 128
    }
}
