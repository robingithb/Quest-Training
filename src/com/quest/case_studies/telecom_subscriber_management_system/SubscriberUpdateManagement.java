package com.quest.case_studies.telecom_subscriber_management_system;

public interface SubscriberUpdateManagement {
    void updateName(int subscriberId , String newName);
    void updatePhoneNumber(int subscriberId , int newPhoneNumber);


}
