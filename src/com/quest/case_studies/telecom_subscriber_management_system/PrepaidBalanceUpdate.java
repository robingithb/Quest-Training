package com.quest.case_studies.telecom_subscriber_management_system;
@FunctionalInterface
public interface PrepaidBalanceUpdate {
    void balanceUpdate(Subscribers subscriber ,  double newBalance);
}
