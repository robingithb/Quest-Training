package com.quest.Auto_mobile_management_system;

import java.time.LocalDateTime;

public class Car extends  Vehicle{
    private int seatingCapacity;

    public Car(int vehicleId, String brand, String model, double price, LocalDateTime manufactureDate, int seatingCapacity) {
        super(vehicleId, brand, model, price, manufactureDate);
        this.seatingCapacity = seatingCapacity;
    }
}
