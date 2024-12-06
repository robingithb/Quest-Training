package com.quest.competativecoding.multiple_inheritance;

public class Bike implements Light,Sound{
    @Override
    public void light() {
        System.out.println("lights from bike");
    }

    @Override
    public void sound() {
        System.out.println("sound from bike");
    }
    public void engine(){
        System.out.println("engine from bike");
    }


}
