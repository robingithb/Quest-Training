package com.quest.property_file;

import com.quest.case_studies.telecom_subscriber_management_system.FileOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    public static  final String FILE_NAME = "documents.txt";
    public static void main(String[] args) {
       //create object for it
        Properties properties = new Properties();
        //its key-value pair
        properties.setProperty("User Name","robin@123");
        properties.setProperty("Password", "Robin@123321");
        properties.setProperty("url","www.robin.com");
        //save properties to file
        try(FileOutputStream out = new FileOutputStream(FILE_NAME)){
            properties.store(out,"Database Configuration");
            System.out.println("Configuration stored");
        }catch (IOException i){
            i.printStackTrace();
        }

        //retrieve from the file
        Properties  loadProperties = new Properties();
        try (FileInputStream in = new FileInputStream(FILE_NAME)){
           loadProperties.load(in);
            System.out.println("user name : "+loadProperties.getProperty("User Name"));
            System.out.println("Password : "+loadProperties.getProperty("Password"));
            System.out.println("url : "+loadProperties.getProperty("url"));
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}
