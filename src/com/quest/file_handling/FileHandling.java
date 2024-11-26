package com.quest.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args)  {
        File file = new File("File2.txt");


      /*  if (file.exists()){
            System.out.println("file created "+file.getName());
        }
        else {
            System.out.println("file not exist");
        }*/
        try {
            if (file.exists()) {
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
    //           String line = sc.nextLine();
                    System.out.println(sc.nextLine());
                }
                System.out.println("file created");
                sc.close();
            } else {
                System.out.println("file not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
        System.out.println("delete successfully");
    }
}
