package com.quest.case_studies.telecom_subscriber_management_system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CallManagingImplementation implements CallManaging {
    //for storing the call details
    @Override
    public void recordCall(Subscriber subscriber, String callType, double duration) {
        //for get the current time
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:4ss");
        String time = timestamp.format(formatter); //formatted to string
        CallDetails callDetails = new CallDetails(callType, duration, time);
        subscriber.addCall(callDetails);
        if (subscriber instanceof PrePaidUsers) { //checking user
            double rate = getRate(callType) * duration;
            subscriber.setBalance(subscriber.getBalance() - rate);
            System.out.println("pre paid balance updated : " + subscriber.getBalance());
        }

    }

    //to display the call records from the call callDetails arraylist
    @Override
    public void displayCallHistory(Subscriber subscriber) {
        System.out.println("call history of : " + subscriber.getSubscriberId());
        for (CallDetails call : subscriber.getCallDetails()) {
            System.out.println("call time : " + call.getCallTime() +
                    "\ncall type : " + call.getCallType() + "\ncall Duration : " + call.getCallDuration() +
                    "\n--------------");
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
