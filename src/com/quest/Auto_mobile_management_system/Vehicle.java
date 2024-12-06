package com.quest.Auto_mobile_management_system;

import com.quest.practice_variables.PrimeNumber;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Vehicle implements Cloneable , Serializable {
    private static final long serialVersionUID = 1L; // for serialization and deserialization
    public static final double DISCOUNT = 0.9;
    private int vehicleId;
    private String brand;
    private String model;
    private double price;
    private LocalDateTime manufactureDate;

    public Vehicle(int vehicleId, String brand, String model, double price, LocalDateTime manufactureDate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                '}';
    }

    @Override
    public int hashCode() {
        return getVehicleId();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Vehicle discountedVehicle = (Vehicle) super.clone();
        discountedVehicle.setPrice(this.getPrice()*DISCOUNT);
        return discountedVehicle;
    }
}
