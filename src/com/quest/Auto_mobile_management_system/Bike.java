package com.quest.Auto_mobile_management_system;

import java.time.LocalDateTime;

public class Bike extends Vehicle{
    private int engineCapacity;

    public Bike(int vehicleId, String brand, String model, double price, LocalDateTime manufactureDate, int engineCapacity) {
        super(vehicleId, brand, model, price, manufactureDate);
        this.engineCapacity = engineCapacity;
    }

}
