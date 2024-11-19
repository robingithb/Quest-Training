package com.quest.oops.bank_flow;

public class CurrentAccount extends BankAccount {

    private double overDraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overDraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public void viewAccountBalance() {
        double balanceAmount = getBalance();
        System.out.println("Amount Balance = " + balanceAmount);
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() + overDraftLimit) >= amount) {
            if (getBalance() < amount) {
                setOverDraftLimit(overDraftLimit - amount);
                setBalance(0);
                System.out.println("Amount withdraw with help of overdraft");
            } else {
                double newBalance = getBalance() - amount;
                setBalance(newBalance);
                System.out.println("Amount withdraw from account");
            }
        } else {
            System.out.println("Insufficient draft and account");
        }
    }
}
