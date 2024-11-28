package com.quest.case_studies.telecom_subscriber_management_system;

public class PostpaidUsers extends Subscriber {
    private String subscriberPlanType;
    //constructor
    public PostpaidUsers(int subscriberId, String subscriberName, int subscriberPhoneNumber, double balance ) {
        super(subscriberId, subscriberName, subscriberPhoneNumber, balance);
        this.subscriberPlanType = "postpaid";
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
