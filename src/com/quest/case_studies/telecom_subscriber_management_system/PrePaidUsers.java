package com.quest.case_studies.telecom_subscriber_management_system;

public class PrePaidUsers extends Subscriber{
    private String subscriberPlanType;

    public PrePaidUsers(int subscriberId, String subscriberName, int subscriberPhoneNumber, double balance) {
        super(subscriberId, subscriberName, subscriberPhoneNumber, balance);
        this.subscriberPlanType = "prepaid";
    }


    public String getSubscriberPlanType() {
        return subscriberPlanType;
    }

    public void setSubscriberPlanType(String subscriberPlanType) {
        this.subscriberPlanType = subscriberPlanType;
    }


    public String displayDetails(){
        return super.toString() + "Subscriber Type :"+getSubscriberPlanType();
    }


}
