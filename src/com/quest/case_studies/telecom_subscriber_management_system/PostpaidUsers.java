package com.quest.case_studies.telecom_subscriber_management_system;

public class PostpaidUsers extends Subscribers{
    private String subscriberPlanType;
    //constructor
    public PostpaidUsers(int subscriberId, String subscriberName, int subscriberPhoneNumber, double balance , String subscriberPlanType) {
        super(subscriberId, subscriberName, subscriberPhoneNumber, balance);
        this.subscriberPlanType = getSubscriberPlanType();
    }


    public String getSubscriberPlanType() {
        return subscriberPlanType;
    }

    public void setSubscriberPlanType(String subscriberPlanType) {
        this.subscriberPlanType = subscriberPlanType;
    }
    //displaying with plan type
    public String displayDetails(){
        return super.toString() + "Subscriber Type :"+getSubscriberPlanType();
    }



}
