package com.quest.competativecoding.multiple_inheritance;

public class Car implements Light,Sound {

    @Override
    public void light() {
        System.out.println("Lights from Car");
    }

    @Override
    public void sound() {
        System.out.println("Sound from Car");
    }
    public void engine(){
        System.out.println("engin from Car");
    }
}
