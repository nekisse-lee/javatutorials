package org.opentutorials.javatutorials.ch18_io.sec04_file.exam03_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class FileOutputStreamExample  {
    public static void main(String[] args) throws Exception {
        String originalFileName = "/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec04_file/exam03_fileoutputstream/house.jpg";
        String targetFileName= "Temp/house.jpg";

        FileInputStream fis  = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];

        while ((readByteNo = fis.read(readBytes)) != -1){
            fos.write(readBytes, 0,readByteNo);
        }

        fos.flush();
        fis.close();
        fos.close();

        System.out.println("복사가 잘 되었습니다.");


    }
}
