package com.quest.oops.memory_allocation;

public class ExampleString {
    public static void main(String[] args) {
        String s1 = "Robin";
        String s2 = "Thomas";
        StringBuilder s3 = new StringBuilder("Robin");
        StringBuilder s4 = new StringBuilder("Thomas");
        System.out.println("appending the string");
        s3.append(" ").append(s4); //add to the existing data
        System.out.println(s3);
        System.out.println("Reverse the string");
        System.out.println(s3.reverse());
        System.out.println("Replacing the string with other string");
        System.out.println(s4.replace(1,3,"o")); //change is not include the 3,include before 3
        System.out.println("Deleting characters with the limit");
        System.out.println(s4.delete(1,5));
        System.out.println("Inserting string to particular place");
        System.out.println(s4.insert(1,"homas")); //offset like its direct count start from 1.after offset it will insert
        System.out.println("character at position");
        System.out.println(s4.charAt(1));  //character at position











//        check1(s3,s4);
    }

    public static void check(String s1 , String s2){
        if(s1 == s2){
            System.out.println(true);
        }
        else System.out.println(false);
        if(s1.equalsIgnoreCase(s2)){
            System.out.println(true);
        }else System.out.println(false);
        if(s1.contains(s2)){
            System.out.println(true);
        }else System.out.println(false);
    }
    public static void check1(StringBuilder s1 , StringBuilder s2){
        if(s1 == s2){
            System.out.println(true);
        }
        else System.out.println(false);
        if(s1.equals(s2)){
            System.out.println(true);
        }else System.out.println(false); //why they false ->
//        if(s1.contains(s2)){
//            System.out.println(true);
//        }else System.out.println(false);
    }
}
