package com.quest.oops.bank_flow;



public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void setAccountNumber(int number) {
        if (number < 0) {
            System.out.println("Invalid");
        } else {
            this.accountNumber = number;
        }
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public void setBalance(int balanceAmount) {
        if (balanceAmount > 0) {
            this.balance = balanceAmount;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Amount credited");
        } else {
            System.out.println("Amount not credited or insufficient amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdraw");
        } else {
            System.out.println("Insufficient funds or amount");
        }


    }
}

