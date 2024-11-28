package com.quest.case_studies.telecom_subscriber_management_system;

import java.util.ArrayList;

public class SubscriberManagement implements SubscriberUpdateManagement {
    private ArrayList<Subscriber> subscribersList;
    private ArrayList<CallDetails>callDetails;
    CallManagingImplementation callManager;
    PostPaidBillGeneratorImpl billGenerator;
    PrepaidBalanceUpdateImpl balanceUpdater;
    FileOperations file;


    SubscriberManagement() {
        subscribersList = new ArrayList<>(); //list of subscribers
        callManager = new CallManagingImplementation();
        billGenerator = new PostPaidBillGeneratorImpl();
        balanceUpdater = new PrepaidBalanceUpdateImpl();

    }

    public ArrayList<Subscriber> getSubscribersList() {
        return subscribersList;
    }

    public void setSubscribersList(ArrayList<Subscriber> subscribersList) {
        this.subscribersList = subscribersList;
    }

    //to add the subscriber
    public void addSubscribers(Subscriber subscriber) {
        if (subscriber.isValid()) {
            subscribersList.add(subscriber);
            System.out.println("Subscriber added : "+subscriber.getSubscriberId());
        } else {
            System.out.println("not added");
        }

    }

    //update the subscribers name
    @Override
    public void updateName(int subscriberId, String newName) {
        for (Subscriber subscribers : subscribersList) {
            if (subscribers.getSubscriberId() == subscriberId) {
                subscribers.setSubscriberName(newName);
                System.out.println("subscriber name updated : "+newName);
                return;
            }
        }
        throw new NotFoundUser("subscriber not found ..failed to update name");
    }

    //to update subscribers phone number
    @Override
    public void updatePhoneNumber(int subscriberId, int newNumber) {
        for (Subscriber subscribers : subscribersList) {
            if (subscribers.getSubscriberId() == subscriberId) {
                subscribers.setSubscriberPhoneNumber(newNumber);
                System.out.println("Phone number updated : "+newNumber);
                return;
            }
        }
        throw new NotFoundUser("subscriber not found ..failed to update phone number");
    }

    //to record a call
    public void recordCall(int subscriberId, String callType, double callDuration) {
        for (Subscriber subscriber : subscribersList) {
            if (subscriber.getSubscriberId() == subscriberId) {
                callManager.recordCall(subscriber, callType, callDuration);
                System.out.println("Call recorded successfully");
                return;
            }
        }
        throw new NotFoundUser("subscriber not found ..failed to record the call");
    }

    //display call history
    public void displayCallHistory(int subscriberId) {
        for (Subscriber subscriber : subscribersList) {
            if (subscriber.getSubscriberId() == subscriberId) {
                callManager.displayCallHistory(subscriber);
                return;
            }
        }
        throw new NotFoundUser("subscriber not found ..failed display the call history");
    }

    //generate bills of postpaid user
    public void generateBills(int subscriberId) {
        for (Subscriber subscriber : subscribersList) {
            if (subscriber.getSubscriberId() == subscriberId) {
                billGenerator.generateBill(subscriber);
                return;
            }
        }
        throw new NotFoundUser("subscriber not found ..failed to generate the bills");
    }
    //update balance of prepaid user

    public void balanceUpdate(int subscriberId, double newAmount) {
        for (Subscriber subscriber : subscribersList) {
            if (subscriber.getSubscriberId() == subscriberId) {
                balanceUpdater.balanceUpdate(subscriber, newAmount);
                return;
            }
        }
        throw new NotFoundUser("subscriber not found ..failed to update the balance");
    }
    //display the list of subscribers
    public void displaySubscribes(){
        for(Subscriber subscriber : subscribersList){
            System.out.println(subscriber.displaySubscriber());
        }

    }
    //getting call details

    //storing subscribers to file
    public void saveSubscribers(){
        file.saveSubscribers(getSubscribersList());
    }

//    //storing call details to file
//    public void saveCallDetails(){
//        file.saveCallDetails(callDetails);
//    }

    //retrieving subscribers from file
    public void retrievingSubscribers(){
        subscribersList = file.loadSubscribers();
    }

//    //retrieving call details from file
//    public void retrievingCallDetails(){
//        callDetails = file.loadCallDetails();
//    }


}
