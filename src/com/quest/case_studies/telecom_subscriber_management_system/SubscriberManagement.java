package com.quest.case_studies.telecom_subscriber_management_system;

import java.util.ArrayList;

public class SubscriberManagement implements  SubscriberUpdateManagement{
    private ArrayList<Subscribers>subscribersList;
    SubscriberManagement(){
        ArrayList<Subscribers>subscribersList = new ArrayList<>(); //list of subscribers
    }

    public ArrayList<Subscribers> getSubscribersList() {
        return subscribersList;
    }

    public void setSubscribersList(ArrayList<Subscribers> subscribersList) {
        this.subscribersList = subscribersList;
    }

    //to add the subscriber
    public void addSubscribers(Subscribers subscriber){
        if(subscriber.isValid()) {
            subscribersList.add(subscriber);
        }
        else {
            System.out.println("not added");
        }

    }
    //update the subscribers name
    @Override
    public boolean updateName(Subscribers subscriber , String newName){
        for(Subscribers subscribers : subscribersList){
            if(subscriber.equals(subscribers)){
                subscribers.setSubscriberName(newName);
                return true;
            }
        }
        return false;
    }
    //to update subscribers phone number
    @Override
    public boolean updatePhoneNumber(Subscribers subscriber , int newNumber) {
        for(Subscribers subscribers : subscribersList){
            if(subscriber.equals(subscribers)){
                subscribers.setSubscriberPhoneNumber(newNumber);
                return true;
            }
        }
        return false;
    }

}
