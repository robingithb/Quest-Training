package com.quest.case_studies.telecom_subscriber_management_system;

import java.io.*;
import java.util.ArrayList;

public class FileOperations {

    public static final String SUBSCRIBERS_FILE = "subscribersData.txt";
    public static final String CALL_HISTORY_FILE = "callData.txt";

    //saving subscribers
    // Save subscribers to file using BufferedOutputStream
    public void saveSubscribers(ArrayList<Subscriber> subscribersList) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(SUBSCRIBERS_FILE))) {
            for (Subscriber subscriber : subscribersList) {
                String data = subscriber.getSubscriberId() + "," +
                        subscriber.getSubscriberName() + "," +
                        subscriber.getSubscriberPhoneNumber() + "," +
                        subscriber.getBalance() + "\n";
                bos.write(data.getBytes());
            }
            System.out.println("Subscribers saved successfully.");
        } catch (IOException e) {
            System.err.println("Error while saving subscribers: " + e.getMessage());
        }
    }

    // Save call details to file using BufferedOutputStream
    public void saveCallDetails(ArrayList<CallDetails> callDetailsList) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(CALL_HISTORY_FILE))) {
            for (CallDetails call : callDetailsList) {
                String data = call.getCallType() + "," +
                        call.getCallDuration() + "," +
                        call.getCallTime() + "\n";
                bos.write(data.getBytes());
            }
            System.out.println("Call details saved successfully.");
        } catch (IOException e) {
            System.err.println("Error while saving call details: " + e.getMessage());
        }
    }

    // Load subscribers from file using BufferedInputStream
    public ArrayList<Subscriber> loadSubscribers() {
        ArrayList<Subscriber> subscribersList = new ArrayList<>();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SUBSCRIBERS_FILE))) {
            byte[] buffer = bis.readAllBytes();
            String data = new String(buffer);
            String[] lines = data.split("\n");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    String[] fields = line.split(",");
                    int id = Integer.parseInt(fields[0]);
                    String name = fields[1];
                    int phone = Integer.parseInt(fields[2]);
                    double balance = Double.parseDouble(fields[3]);
                    String type = fields[4];
                    if (type.equalsIgnoreCase("postpaid")) {
                        subscribersList.add(new PostpaidUsers(id, name, phone, balance));
                    } else {
                        subscribersList.add(new PrePaidUsers(id, name, phone, balance));
                    }
                }
            }
            System.out.println("Subscribers loaded successfully.");
        } catch (IOException e) {
            System.err.println("Error while loading subscribers: " + e.getMessage());
        }
        return subscribersList;
    }

    // Load call details from file using BufferedInputStream
    public ArrayList<CallDetails> loadCallDetails() {
        ArrayList<CallDetails> callDetailsList = new ArrayList<>();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(CALL_HISTORY_FILE))) {
            byte[] buffer = bis.readAllBytes();
            String data = new String(buffer);
            String[] lines = data.split("\n");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    String[] fields = line.split(",");
                    String callType = fields[0];
                    int duration = Integer.parseInt(fields[1]);
                    String timestamp = fields[2];
                    callDetailsList.add(new CallDetails(callType, duration, timestamp));
                }
            }
            System.out.println("Call details loaded successfully.");
        } catch (IOException e) {
            System.err.println("Error while loading call details: " + e.getMessage());
        }
        return callDetailsList;
    }
}


