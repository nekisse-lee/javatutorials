package org.opentutorials.javatutorials.ch18_io.sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("test.txt");
        int readCharNo;
        char[] cbuf  = new char[2];
        String data = "";
        /*while((readCharNo=reader.read(cbuf)) != -1){
            data += new String(cbuf, 0,readCharNo);
        }*/

        while(true){
            readCharNo = reader.read(cbuf);
            if (readCharNo==-1) break;
        }

        System.out.print(data);


        reader.close();
    }
}
