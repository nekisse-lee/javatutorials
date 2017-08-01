package org.opentutorials.javatutorials.ch19.sec04.exam02_file_copy;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

/**
 * Created by Nekisse_lee on 2017. 8. 1..
 */
public class FilesCopyMethodExample {
    public static void main(String[] args) throws Exception {
        Path from = Paths.get("src/org/opentutorials/javatutorials/ch19/sec04/exam02_file_copy/house1.jpg");
        Path to = Paths.get("src/org/opentutorials/javatutorials/ch19/sec04/exam02_file_copy/house2.jpg");

        Files.copy(from,to, StandardCopyOption.REPLACE_EXISTING);



    }
}
