package com.quest.practice_variables;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev*10) + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + " is not a  palindrome");
        }
    }
}
