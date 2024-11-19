package com.quest.oops.bank_flow;

public class SavingsAccount extends BankAccount {
    private double minimumBalance;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double minimumBalance) {
        super(accountNumber, accountHolderName, balance);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void viewAccountBalance() {
        double balanceAmount = getBalance();
        System.out.println("Amount Balance = " + balanceAmount);
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() - amount) > minimumBalance) {
            super.withdraw(amount);
            System.out.println("Amount debited");
        } else {
            System.out.println("Insufficient minimum balance");
        }
    }
}
