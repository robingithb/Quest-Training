package com.quest.oops.bank_flow;

public abstract class Transaction {
    protected BankAccount account;

    Transaction(BankAccount account) {
        this.account = account;
    }

    abstract void processTransaction(double amount);
}
