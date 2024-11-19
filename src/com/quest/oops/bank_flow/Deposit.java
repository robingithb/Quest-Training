package com.quest.oops.bank_flow;

public class Deposit extends Transaction {

    public Deposit(BankAccount account) {
        super(account);
    }

    @Override
    void processTransaction(double amount) {
        if (amount > 0) {
            account.deposit(amount);
        } else {
            System.out.println("Invalid deposited amount");
        }
    }
}
