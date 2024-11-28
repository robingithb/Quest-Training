package com.quest.case_studies.telecom_subscriber_management_system;

//exception for checking correct user
public class UserNotSupported extends RuntimeException {
    public UserNotSupported(String message) {
        super(message);
    }
}
