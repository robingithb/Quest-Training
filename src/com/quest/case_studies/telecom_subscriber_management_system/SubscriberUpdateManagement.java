package com.quest.case_studies.telecom_subscriber_management_system;

public interface SubscriberUpdateManagement {
    boolean updateName(Subscribers subscribers , String newName);
    boolean updatePhoneNumber(Subscribers subscribers , int newPhoneNumber);


}
