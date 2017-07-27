package org.opentutorials.javatutorials.ch18_io.sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class ReadExample3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("test.txt");
        int readByteNo;
        byte[] readBytes = new byte[8];
        readByteNo = is.read(readBytes, 2, 3);

        for (int i = 0; i < readBytes.length; i++){
            System.out.println(readBytes[i]);
        }
        is.close();

    }

}
