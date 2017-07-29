package org.opentutorials.javatutorials.ch18_io.sec04_file.exam04_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class FileReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec04_file/exam04_file_reader/FileReaderExample.java");

        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo=fr.read(cbuf)) != -1){
            String data = new String(cbuf,0,readCharNo);
            System.out.println(data);
        }

        fr.close();

    }
}
