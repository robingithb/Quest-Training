package com.quest.oops.bank_flow;

import java.util.Scanner;

public class MainDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount(101, "Robin", 1500, 1000);
        CurrentAccount currentAccount = new CurrentAccount(102, "Sruthi", 1200, 1000);

        Transaction deposit = new Deposit(savingsAccount);
        Transaction withdraw = new Withdraw(savingsAccount);
        System.out.println("Operations to the Savings Account");
        System.out.println("Enter the amount to deposit");
        double amount = sc.nextInt();
        deposit.processTransaction(amount);
        System.out.println("Enter amount to withdraw");
        amount = sc.nextInt();
        withdraw.processTransaction(amount);
        System.out.println("Account balance " + savingsAccount.getBalance());

        System.out.println("Operations to the Current Account");
        deposit = new Deposit(currentAccount);
        withdraw = new Withdraw(currentAccount);
        System.out.println("Enter the amount to deposit");
        amount = sc.nextInt();
        deposit.processTransaction(amount);
        System.out.println("Enter amount to withdraw");
        amount = sc.nextInt();
        withdraw.processTransaction(amount);
        System.out.println("Account balance " + currentAccount.getBalance());


    }
}
