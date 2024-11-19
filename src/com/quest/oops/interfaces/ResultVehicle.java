package com.quest.oops.interfaces;

public class ResultVehicle extends AbstractA implements Wheels,Engine  {


    @Override
    public void engineType() {
        System.out.println("Diesel Engine");
    }

    @Override
    public void year() {
        System.out.println("year 2024");
    }

    @Override
    public void numberOfWheels() {
        System.out.println("4 wheeler");
    }

    @Override
    public void brand() {
        System.out.println("Apollo");
    }

    @Override
    void add() {

    }
}
