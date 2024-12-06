package com.quest.competativecoding.multiple_inheritance;

public class MainDrive {
    public static void main(String[] args) {
        Car vehicle = new Car();
        vehicle.engine();
        vehicle.sound();
        vehicle.light();
        Bike bike = new Bike();
        bike.engine();
        bike.sound();
        bike.light();
    }


}
