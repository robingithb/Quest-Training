package com.quest.practice_variables;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Robin";
        String str2 = "Thomas";
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        System.out.println(str.codePointAt(2));
        System.out.println(str.codePointCount(0, 3));
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.concat(str2));
        System.out.println(str.contains("bin"));
        System.out.println(str.contentEquals("Robin"));
        char[] strArray = {'R', 'o', 'b', 'i'};
        String str3 = "";
        str3 = str3.copyValueOf(strArray, 0, 2);
        System.out.println(str3);
        System.out.println(str.endsWith("n"));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str3));
        byte[] byteArray = str.getBytes();
        System.out.println(byteArray[2]);
        char[] charArray = {'R', 'o', 'b', 'i'};
        str.getChars(1, 3, charArray, 0);
        System.out.println(charArray); // here string  copied to the character array
        System.out.println(str.hashCode());
        System.out.println(str.indexOf("b"));
        System.out.println(str.intern());
        System.out.println(str.isEmpty());
        String Names = String.join(" ", "Robin", "Thomas", "Pulikkottil");
        System.out.println(Names);
        System.out.println(str.lastIndexOf("i"));
        System.out.println(str.length());
        String animal = "cat|dog|lion";
        System.out.println("cat".matches(animal));
        String word = "hai Robin , lets go Robin";
        System.out.println(word.replaceAll("Robin", "John"));
        System.out.println(word.replaceFirst("Robin", "John"));
        String[] stringArray = word.split(" ");
        for (String s : stringArray) {
            System.out.println(s);
        }
        System.out.println(str.startsWith("R"));
        System.out.println(str.subSequence(1, 3));
        System.out.println(str.substring(1, 3));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String data = "     hai";
        System.out.println(data.trim());
        System.out.println(String.valueOf(str));


    }
}
