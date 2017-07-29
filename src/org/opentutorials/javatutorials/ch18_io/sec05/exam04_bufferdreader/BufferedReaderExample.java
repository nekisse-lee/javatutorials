package org.opentutorials.javatutorials.ch18_io.sec05.exam04_bufferdreader;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        System.out.print("입력: ");
        String lineString = br.readLine();
        System.out.println("출력: " + lineString);

        br.close();
        reader.close();
        is.close();
    }

}
