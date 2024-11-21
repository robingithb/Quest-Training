package com.quest.oops.memory_allocation;

public class StringPractice {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str11 = "Hello";
        StringBuilder str2 = new StringBuilder("Hello");
        StringBuilder str22 = new StringBuilder("Hello");
        StringBuffer str3 = new StringBuffer("Hello");
        StringBuffer str33 = new StringBuffer("Hello");
        System.out.println("\nString check");
        check1(str1,str11);
        System.out.println("\nString Builder check");
        check2(str2,str22);
        System.out.println("\nString Buffer check");
        check3(str3,str33);

        System.out.println("\nString Builder\n");
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
        System.out.println(s4.charAt(1));

        System.out.println("\nString Buffer\n");
        StringBuffer s5 = new StringBuffer("Robin");
        StringBuffer s6 = new StringBuffer("Thomas");
        System.out.println("appending the string");
        s3.append(" ").append(s5); //add to the existing data
        System.out.println(s5);
        System.out.println("Reverse the string");
        System.out.println(s5.reverse());
        System.out.println("Replacing the string with other string");
        System.out.println(s6.replace(1,3,"o")); //change is not include the 3,include before 3
        System.out.println("Deleting characters with the limit");
        System.out.println(s6.delete(1,5));
        System.out.println("Inserting string to particular place");
        System.out.println(s6.insert(1,"homas")); //offset like its direct count start from 1.after offset it will insert
        System.out.println("character at position");
        System.out.println(s6.charAt(1));  //character at posi//character at position

    }

    public static void check1(String s1, String s2) {
        if (s1 == s2) {
            System.out.println("String == true");
        } else System.out.println("String == false");

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("String equals ");
        } else System.out.println("Not equals");
    }

    public static void check2(StringBuilder s1, StringBuilder s2) {
        if (s1 == s2) {
            System.out.println("String == true");
        } else System.out.println("String == false");

        if (s1.equals(s2)){
            System.out.println("String equals ");
        }else System.out.println("Not equals");
    }

    public static void check3(StringBuffer s1, StringBuffer s2) {
        if (s1 == s2) {
            System.out.println("String == true");
        } else System.out.println("String == false");

        if (s1.equals(s2)){
            System.out.println("String equals ");
        }else System.out.println("Not equals");
    }
}
