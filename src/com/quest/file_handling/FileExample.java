package com.quest.file_handling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) {
        ArrayList<String>name = new ArrayList<>();
        name.add("Ravi");
        name.add("Ravi");
        name.add("Ravi");
        name.add("Ravi");
        name.add("Ravi");
    }
    public static void addFile(ArrayList<Integer> elements) throws FileNotFoundException {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ArrayData.txt"));
            String[] data = elements.toArray(new String[0]);


    }
}
