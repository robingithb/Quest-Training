package com.quest.case_studies.telecom_subscriber_management_system;

public enum CallType {
    LOCAL(1.0),
    STD(2.0),
    ISD(5.0);

    private final double rate;

    CallType(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
    // Method to check and return the corresponding enum for the string
    public static CallType fromString(String callType) {
        if (callType == null) {
            return null;
        }
        for (CallType type : CallType.values()) {
            if (type.name().equalsIgnoreCase(callType.trim())) {
                return type;
            }
        }
        return null; // Return null if no matching type is found
    }

}
