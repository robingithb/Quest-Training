package com.quest.case_studies.telecom_subscriber_management_system;

public class PostPaidBillGenerator implements BillGenerator{
    @Override
    //this method is used for bill generation of the post paid calls
    public double generateBill(Subscribers subscriber) {
        if(!(subscriber instanceof PostpaidUsers)){
            throw new UserNotSupported("this is for post paid users");
        }
        double totalCost = 0;
        for (CallDetails record : subscriber.getCallDetails()) {
            totalCost += getRate(record.getCallType()) * record.getCallDuration();
        }
        return totalCost;
    }
    private double getRate(String callType) {
        switch (callType.toLowerCase()) {
            case "local": return 1.0;
            case "std": return 2.0;
            case "isd": return 5.0;
            default: return 0.0;
        }
    }
}
