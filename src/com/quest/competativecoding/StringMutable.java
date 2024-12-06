package com.quest.competativecoding;

public class StringMutable {
    public static void main(String[] args) {
        String name = "Robin";
        String name1= name+"Thomas";
        if (name1 == name){
            System.out.println("same");
        }else {
            System.out.println("different, we cant concat to same object its immutable");
        }
    }
}
