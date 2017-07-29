package org.opentutorials.javatutorials.ch18_io.sec05.exam05_bufferedoutputstream;


import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec05/exam05_bufferedoutputstream/forest.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("Temp/forest.jpg");
        start = System.currentTimeMillis();

        while ((data = bis.read()) != -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();

        fos.close();
        bis.close();
        fis.close();

        System.out.println("사용하지 않을때: " +(end-start) + "ms");


        fis = new FileInputStream("/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec05/exam05_bufferedoutputstream/forest.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("Temp/forest.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();

        while ((data = bis.read()) != -1){
            bos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();


        bos.close();
        fos.close();
        bis.close();

        fis.close();


        System.out.println("사용했을때: " +(end-start) + "ms");








    }
}
