package org.opentutorials.javatutorials.ch16_Stream.sec02_streamkind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/Nekisse_lee/Desktop/thisisjava-sourcefile");
        Stream<Path> stream = Files.list(path);
        stream.forEach(path1 -> System.out.println(path1.getFileName()));



    }
}
