package com.quest.competativecoding;

import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        String[] str = new String[]{"flower", "flow", "fly"};
       Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length-1];
        int index = 0;
        while(index < s1.length() && index < s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            } else {
                break;
            }
        }

        System.out.println(s1.substring(0, index));

    }
}
