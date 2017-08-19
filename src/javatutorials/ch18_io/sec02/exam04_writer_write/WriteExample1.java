package javatutorials.ch18_io.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("test.txt");
        char[] data = "홍길동".toCharArray();
        for (int i = 0; i < data.length; i++){
            writer.write(data[i]);
        }
        writer.flush();
        writer.close();

    }
}
