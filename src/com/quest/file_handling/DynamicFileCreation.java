package com.quest.file_handling;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class DynamicFileCreation {
    public static void main(String[] args) {
        File file = null;
        try{
            file = new File("File3.txt");
            if(file.createNewFile() || file.exists()){
                System.out.println("file created successfully "+file.getName());
            }
            else {
                System.out.println("file not created");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            file.delete();
            System.out.println("deletes successfully");
        }


    }
}
