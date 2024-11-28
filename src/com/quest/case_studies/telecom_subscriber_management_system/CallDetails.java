package com.quest.case_studies.telecom_subscriber_management_system;

import java.util.ArrayList;

public class CallDetails {
    private String callType;
    private double callDuration;
    private String callTime;

    public CallDetails(String callType, double callDuration, String callTime) {
        this.callType = callType;
        this.callDuration = callDuration;
        this.callTime = callTime;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public double getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(double callDuration) {
        this.callDuration = callDuration;
    }

    public String getCallTime() {
        return callTime;
    }

    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }

}
