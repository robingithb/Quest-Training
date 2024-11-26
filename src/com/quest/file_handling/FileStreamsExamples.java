package com.quest.file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamsExamples {
    public static void main(String[] args) {
        String file_name = "File2.txt";
        File file = new File(file_name);
        int r ;
        try{
            if (file.exists()  || file.createNewFile()){
                System.out.println("file created");
                String str = "\nI am robin \n from Thrissur \n line 3 \n line 4 \n line 5 \n line 6 \n line 7 \n line  8 \n line 9";
                FileOutputStream fileOutputStream = new FileOutputStream(file_name,true);
                fileOutputStream.write(str.getBytes());
                FileInputStream fileInputStream = new FileInputStream(file_name);
                while ( (r = fileInputStream.read() )!= -1){
                    System.out.print((char)r);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }else {
                System.out.println("file not created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
