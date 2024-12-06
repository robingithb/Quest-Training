package com.quest.Auto_mobile_management_system;

import java.time.LocalDateTime;
import java.util.*;

public class Customer {
    private String customerId;
    private String customerName;
    private String email;
    private List<Vehicle>purchasedVehicles;
    private Map<Integer,LocalDateTime> purchasedTime;

    public Customer(String customerId, String customerName, String email) {
        this.email = email;
        this.customerName = customerName;
        this.customerId = customerId;
        this.purchasedVehicles = new ArrayList<>();
        purchasedTime = new HashMap<>();
    }
//getters
    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setPurchasedVehicles(List<Vehicle> purchasedVehicles) {
        this.purchasedVehicles = purchasedVehicles;
    }

    public Map<Integer, LocalDateTime> getPurchasedTime() {
        return purchasedTime;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", purchasedVehicles=" + purchasedVehicles +
                '}';
    }

}
