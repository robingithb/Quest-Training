package com.quest.case_studies.telecom_subscriber_management_system;
@FunctionalInterface
public interface PrepaidBalanceUpdate {
    void balanceUpdate(Subscriber subscriber , double newBalance);
}
