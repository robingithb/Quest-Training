package com.quest.case_studies.telecom_subscriber_management_system;

public class PrePaidUsers extends Subscribers implements PrepaidBalanceUpdate{
    private String subscriberPlanType;

    public PrePaidUsers(int subscriberId, String subscriberName, int subscriberPhoneNumber, double balance , String subscriberPlanType) {
        super(subscriberId, subscriberName, subscriberPhoneNumber, balance);
        this.subscriberPlanType = subscriberPlanType;
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

    //to update the balance of the prepaid users
    @Override
    public void balanceUpdate(Subscribers subscriber, double newBalance) {
        if (subscriber instanceof PrePaidUsers){
            subscriber.setBalance(subscriber.getBalance()+newBalance);

        }
        //if user is post paid them
        else throw  new UserNotSupported("its only supported to prepaid Customers");
    }
}
