package com.quest.file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("File1.txt");

            System.out.println("file created successfully");
            int r;
            String str = "Input as Streams";
            FileOutputStream fileOutputStream = new FileOutputStream("File1.txt");
            fileOutputStream.write(str.getBytes());
            while((r = fileInputStream.read() )!= -1){
                System.out.print((char)r);
            }
//            fileInputStream.read();
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("\nfie stream closed");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
