package com.quest.case_studies.telecom_subscriber_management_system;

public class PrepaidBalanceUpdateImpl implements PrepaidBalanceUpdate {
    //to update the balance of the prepaid users
    @Override
    public void balanceUpdate(Subscriber subscriber, double newBalance) {
        if (subscriber instanceof PrePaidUsers){
            subscriber.setBalance(subscriber.getBalance()+newBalance);
            System.out.println("Balance updated !!! new Balance : "+subscriber.getBalance());
        }
        //if user is post paid them
        else throw  new UserNotSupported("its only supported to prepaid Customers");
    }
}
