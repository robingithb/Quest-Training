package com.quest.file_handling;

import java.io.*;

public class BufferedClass {
    public static void main(String[] args) {
        String str= "hei malini, i m krishnan";
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("File1.txt"));
            BufferedOutputStream bufferedOutputStream  = new BufferedOutputStream(new FileOutputStream("File2.txt"));
            byte[] buf = new byte[1024];
            int c ;
            while((c = bufferedInputStream.read(buf)) != -1){
                System.out.println((char)c);
                bufferedOutputStream.write(buf , 0,c);
//                System.out.println((char)c);

            }
            bufferedOutputStream.flush();
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch  (IOException i){
          i.printStackTrace();
        }

    }
}
