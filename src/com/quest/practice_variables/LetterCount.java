package com.quest.practice_variables;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();

        for (int i = 0; i<str.length();i++){
            System.out.println(str.charAt(i));

        }
      int count = 0;
        char ch;
        for(int i = 0;i<str.length();i++){
          count = 1;
          ch = str.charAt(i);
          for (int j =0;j<str.length();j++){
              if (ch == str.charAt(j)){
                  count +=1;
              }
              System.out.println(str.charAt(i) + " " + count);
          }

      }
    }
    }

