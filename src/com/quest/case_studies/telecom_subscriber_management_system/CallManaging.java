package com.quest.case_studies.telecom_subscriber_management_system;

public interface CallManaging {
    void recordCall(Subscribers subscriber , String callType , double duration);
    void displayCallHistory(Subscribers subscriber);
}
