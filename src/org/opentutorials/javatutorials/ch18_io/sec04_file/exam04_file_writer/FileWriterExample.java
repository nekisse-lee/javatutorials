package org.opentutorials.javatutorials.ch18_io.sec04_file.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class FileWriterExample {
    public static void main(String[] args) throws Exception {
        File file = new File("Temp/file.txt");

        FileWriter fw = new FileWriter(file);

        fw.write("FileWrite는 한글로 된" + "\r\n");
        fw.write("문자열을 바로 출력할 수 있다." + "\r\n");

        fw.flush();
        fw.close();

        System.out.println("파일에 저장 되었습니다.");
    }
}
