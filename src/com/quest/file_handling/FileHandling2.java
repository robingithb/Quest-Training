package com.quest.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("FileWrite1.txt");
            fileWriter.write("Hai write from file writer");
            CharSequence charSequence = new CharSequence() {
                @Override
                public int length() {
                    return 0;
                }

                @Override
                public char charAt(int index) {
                    return 0;
                }

                @Override
                public CharSequence subSequence(int start, int end) {
                    return null;
                }

                @Override
                public String toString() {
                    return "file writer char sequence";
                }
            };

            fileWriter.append(charSequence);
            fileWriter.append(" # robin Thomas",0,15);

            fileWriter.close();
            System.out.println("File writer created");

        }
        catch (IOException i){
            i.printStackTrace();
        }

    }
}
