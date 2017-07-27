package org.opentutorials.javatutorials.ch18_io.sec02.exam02_output_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("text.txt");
        byte[] data = "ABC".getBytes();
        for (int i = 0; i <data.length; i++){
            os.write(data[i]);
        }
        os.flush();
        os.close();
    }
}
