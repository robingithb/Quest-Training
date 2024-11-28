package com.quest.case_studies.telecom_subscriber_management_system;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CallManagingImplementation implements CallManaging {
    //for storing the call details
    @Override
    public void recordCall(Subscribers subscriber, String callType, double duration) {
        //for get the current time
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy hh-mm-ss");
        String time = String.valueOf(formatter);  //formatted to string
        CallDetails callDetails = new CallDetails(callType, duration, time);
        subscriber.addCall(callDetails);
        if (subscriber instanceof PrePaidUsers) { //checking user
            double rate = getRate(callType) * duration;
            subscriber.setBalance(subscriber.getBalance() - rate);
            System.out.println("post paid balance updated");
        }

    }
    //to display the call records from the call callDetails arraylist
    @Override
    public void displayCallHistory(Subscribers subscriber) {
        System.out.println("call history of : "+subscriber.getSubscriberId());
        for(CallDetails call : subscriber.getCallDetails()){
            System.out.println(call);
        }
    }
    //this is for getting the tariff of the calls
    private double getRate(String callType) {
        switch (callType.toLowerCase()) {
            case "local":
                return 1;
            case "std":
                return 2;
            case "isd":
                return 5;
            default:
                return 0;
        }
    }
}
