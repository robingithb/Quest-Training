package com.quest.case_studies.telecom_subscriber_management_system;

public class NotFoundUser extends RuntimeException {
    public NotFoundUser(String message) {
        super(message);
    }
}
