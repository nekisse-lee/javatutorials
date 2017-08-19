package javatutorials.ch16_Stream.sec02_streamkind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class FromFileContentExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("javatutorials/ch16_Stream/sec02_streamkind/linedata.txt");
        Stream<String> stream;

        //Files.lines()메소드 이용
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(x -> System.out.println(x));
        System.out.println();

        //BufferedReader의 lines() 메소드 이용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(x -> System.out.println(x));
        System.out.println();


    }
}
