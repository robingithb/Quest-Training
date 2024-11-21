package com.quest.oops.memory_allocation;

public class Memory {
    public static void main(String[] args) {
        String str1 = new String("hello"); //str1 and 2 are references ,it's in stack area
        String str2 = new String("hello world");
        String str3 = "hello"; //literals
        String str4  = "hello world"; //literals

        String str5 = str1; //assigning str1 to str 5, str1 obj replaced by str5 they are in same memory location
//        System.out.println("result "+ str1.equalsIgnoreCase(str2));
//        System.out.println("str1  :"+str1.hashCode());
//        System.out.println("str2  :"+str2.hashCode());
        check(str3,str4);
        //because str1 and str2 references are not same even the contents are same String is a class not primitive data type
    }

    private static void check(String str1, String str2) {
        // == used to equals for primitive data checks contents and sometime references
        if(str1 == str2){
            System.out.println(true); //this will answer
        }
        else {
            System.out.println(false);
        }
        //equal always check the contents
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if(str1.contains(str2)){ //to check the str1 is in the str2 ,not equal just contains
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if(str2.contains("hello")){ //to check the str2 is in the hello ,not equal just contains
            System.out.println(true);
        }
        else{
            System.out.println(false);//for literals it will be answers
        }
    }
    public static  void check2(int a,int b){
        if(a==b){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }


}
