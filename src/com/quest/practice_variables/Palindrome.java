package com.quest.practice_variables;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        if(str == null){
            System.out.println("The string is null");
            return ;
        }
        int left = 0;
        int right = str.length()-1;
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        String reverseString =  reverse.toString();

        if(str.equals(reverseString)){
            System.out.println(str +" is a palindrome");
        }
        else{
            System.out.println(str +" is not a palindrome");
        }
    }
}
