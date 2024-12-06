package com.quest.Auto_mobile_management_system;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class ControlManagement {
    public static final String FILE_NAME = "salesData.ser";
    List<Vehicle>vehiclesList ;
    List<Customer>customersList;
    Map<String, Set<Vehicle>>customerAndVehicles;



    public ControlManagement() {
        vehiclesList = new ArrayList<>();
        customersList = new ArrayList<>();
        customerAndVehicles = new HashMap<>();
    }
    //adding vehicle to the inventory
    public void addVehicle(Vehicle vehicle){
        if (!vehiclesList.contains(vehicle)){
            vehiclesList.add(vehicle);
            System.out.println("vehicle added : "+vehicle.getVehicleId());
            return;
        }
        throw new DuplicateEntries("vehicle already here...");
    }
    //search vehicles for specific brands
    public void searchVehicleForSpecificBrand(String brand){
        if(!vehiclesList.isEmpty()){
            List<Vehicle>foundBrands ;
             foundBrands = vehiclesList.stream().filter(vehicle -> vehicle.getBrand().equalsIgnoreCase(brand)).toList();
            if (foundBrands != null){
                for (Vehicle v : foundBrands){
                    System.out.println(v.toString());
                }
            }else {
                System.out.println("No vehicles");
            }
        }
    }

    //adding customers
    public void addCustomer(Customer customer){
        if (!customersList.contains(customer)){
            customersList.add(customer);
            System.out.println("customer added : "+customer.getCustomerName());
            return;
        }
        throw new DuplicateEntries("duplicate Customer...");
    }
    //adding purchased vehicles
    public  void addPurchasedVehicle(String customerId , int vehicleId){
        Customer purchasedCustomer = null;
        Vehicle purchasedVehicle = null;
        for (Customer c : customersList){
            if (c.getCustomerId().equalsIgnoreCase(customerId)){
                purchasedCustomer = c;
            }
        }
        for (Vehicle v : vehiclesList){
            if (v.getVehicleId() == vehicleId){
                purchasedVehicle = v;
            }
        }
        if(purchasedVehicle == null ){
            throw new VehicleNotAvailableException("vehicle or customer not available here....");
        }else {
            LocalDateTime timestamp = LocalDateTime.now(); //finding the time
            Map<Integer,LocalDateTime>purchasedTimesStamp = new HashMap<>();
            purchasedTimesStamp = purchasedCustomer.getPurchasedTime();
            purchasedTimesStamp.put(purchasedVehicle.getVehicleId(),timestamp);

            vehiclesList.remove(purchasedVehicle); //removing vehicle that purchased
            System.out.println("vehicle removed from inventory");
            //adding to the customer vehicle map
            if (!customerAndVehicles.containsKey(purchasedCustomer.getCustomerName())){
            Set<Vehicle>purchased = new HashSet<>();
            purchased.add(purchasedVehicle);
            purchasedCustomer.setPurchasedVehicles(purchased.stream().toList());
            customerAndVehicles.put(purchasedCustomer.getCustomerName(),  purchased);
                System.out.println("vehicle assigned to the customer");
            //if map already contain the customer
            }else {
                Set<Vehicle>addVehicle = customerAndVehicles.get(purchasedCustomer.getCustomerName());
                addVehicle.add(purchasedVehicle);
                System.out.println("existing customer!!! vehicle assigned to the customer");
            }
        }
    }
    //discount vehicle
    public void discountVehicle(int vehicleId) throws VehicleNotAvailableException, CloneNotSupportedException {
        Vehicle originalVehicle = null;
        for (Vehicle vehicle : vehiclesList){
            if (vehicle.getVehicleId() == vehicleId){
                originalVehicle = vehicle;
            }
        }
        if (originalVehicle == null){
            throw  new VehicleNotAvailableException("vehicle i not present here");
        }else {
            Vehicle discounted = (Vehicle) originalVehicle.clone();
            System.out.println("original" +originalVehicle);
            System.out.println(("discounted : "+discounted));
        }
    }
     //serialization and save the code
    public void saveCustomerDetails() throws IOException {
        ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        if (!customerAndVehicles.isEmpty()) {
            ops.writeObject(customerAndVehicles);
            System.out.println("added to the file");
        } else System.out.println("list is empty");
    }
    //deserialization load back from the file
    public void loadBackCustomerDetails() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
        Map<String, Set<Vehicle>> deserializedData = (Map<String, Set<Vehicle>>) ois.readObject();
        System.out.println("Sales data has been deserialized:");
        deserializedData.forEach((customer, vehicles) -> {
            System.out.println("Customer: " + customer);
            vehicles.forEach(vehicle -> System.out.println("\t" + vehicle));
        });
    }
    //display all customer details in descending order
    public void purchasedOrder(){
        for (Map.Entry<String,Set<Vehicle>>entry : customerAndVehicles.entrySet()){
            System.out.println(entry.getKey()+" : ");
            entry.getValue().stream()
                    .sorted(Comparator.comparingDouble(Vehicle::getPrice).reversed())
                    .forEach(vehicle -> System.out.println("\t" + vehicle));
        }
    }
    //printing the date and time of the purchase
    public void purchaseTimeline(){
        for (Customer customer : customersList){
            System.out.println(customer.getCustomerName() +" vehicle details : ");
            customer.getPurchasedTime().forEach((key,value)->{
                System.out.println("Vehicle id : "+key +" time :"+value);
            });
        }
    }



}
