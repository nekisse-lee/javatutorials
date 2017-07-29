package org.opentutorials.javatutorials.ch18_io.sec05.exam02_outputstreamwrite;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class OutputStreamWriteExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Temp/file.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
        writer.write(data);

        writer.flush();
        fos.close();
        System.out.println("파일 저장이 끝났습니다.");

    }

}
