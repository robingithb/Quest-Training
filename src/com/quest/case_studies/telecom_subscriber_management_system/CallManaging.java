package com.quest.case_studies.telecom_subscriber_management_system;

public interface CallManaging {
    void recordCall(Subscriber subscriber, String callType, double duration);

    void displayCallHistory(Subscriber subscriber);
}
