package com.quest.case_studies.telecom_subscriber_management_system;

public class PostPaidBillGeneratorImpl implements BillGenerator {
    @Override
    //this method is used for bill generation of the post paid calls
    public void generateBill(Subscriber subscriber) {
        if (!(subscriber instanceof PostpaidUsers)) {
            throw new UserNotSupported("this is for post paid users");
        }
        double totalCost = 0;
        for (CallDetails record : subscriber.getCallDetails()) {
            CallType callType = CallType.fromString(record.getCallType());
            if (callType == null) {
                System.err.println("Invalid call type: " + record.getCallType() + ". Skipping this record.");
                continue;
            }
            totalCost += callType.getRate() * record.getCallDuration();
        }
        System.out.println("Generated Bill : " + totalCost);
    }


}
