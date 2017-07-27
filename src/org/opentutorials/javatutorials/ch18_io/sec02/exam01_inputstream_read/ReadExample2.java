package org.opentutorials.javatutorials.ch18_io.sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("test.txt");
        int readByteNo;
        byte[] readBytes = new byte[3];
        /*while((readByteNo = is.read(readBytes)) != -1){
            System.out.println(readByteNo);
        }*/
        String data = "";
        while(true){
            readByteNo = is.read(readBytes);
            if(readByteNo==-1)  break;
            data += new String(readBytes, 0, readByteNo);
        }
        System.out.println(data);
is.close();

    }



}
