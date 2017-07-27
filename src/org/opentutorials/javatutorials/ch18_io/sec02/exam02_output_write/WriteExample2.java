package org.opentutorials.javatutorials.ch18_io.sec02.exam02_output_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("test.txt");
        byte[] data = "ABC".getBytes();
        os.write(data);
        os.flush();
        os.close();
    }
}
