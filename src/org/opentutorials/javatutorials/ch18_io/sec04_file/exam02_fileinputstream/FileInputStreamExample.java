package org.opentutorials.javatutorials.ch18_io.sec04_file.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class FileInputStreamExample {
    public static void main(String[] args)  {
        try {
            FileInputStream fis = new FileInputStream("/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec04_file/exam02_fileinputstream/FileInputStreamExample.java");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }

            //System.out.flush();
            fis.close();
        }catch (Exception e ){
            e.printStackTrace();
        }

    }


}
