package com.quest.oops.bank_flow;

public class Withdraw extends Transaction {

    Withdraw(BankAccount account) {
        super(account);
    }

    @Override
    void processTransaction(double amount) {
        account.withdraw(amount);
    }
}
