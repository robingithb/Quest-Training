package com.quest.case_studies.telecom_subscriber_management_system;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Subscribers implements Serializable {

//    D, name, phone number, plan type (Prepaid/Postpaid), and balance.
    private int subscriberId;
    private String subscriberName;
    private int subscriberPhoneNumber;
    private double balance;
    private ArrayList<CallDetails> callDetails = new ArrayList<>();

    public Subscribers(int subscriberId,String subscriberName, int subscriberPhoneNumber, double balance) {
        this.subscriberId = subscriberId;
        this.subscriberName = subscriberName;
        this.subscriberPhoneNumber = subscriberPhoneNumber;
        this.balance = balance;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public int getSubscriberPhoneNumber() {
        return subscriberPhoneNumber;
    }

    public void setSubscriberPhoneNumber(int subscriberPhoneNumber) {
        this.subscriberPhoneNumber = subscriberPhoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void addCall(CallDetails call){
        callDetails.add(call);
    }

    public ArrayList<CallDetails> getCallDetails() {
        return callDetails;
    }
    //checking valid subscriber or not
    public boolean isValid(){
        return this.getSubscriberId() != 0 && this.getSubscriberName() != null && this.getSubscriberPhoneNumber() != 0;
    }
    //displaying the subscribers
    @Override
    public String toString() {
        return "Subscriber ID :"+getSubscriberId() +
                "Subscriber Name : "+getSubscriberName() +
                "Subscriber PhoneNUmber : "+getSubscriberPhoneNumber() +
                "Subscriber Balance : "+getBalance();
    }
}
