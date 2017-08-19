package javatutorials.ch18_io.sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("test.txt");
        int readDate;
       /* while((readDate=reader.read())!= -1){
            System.out.print((char)readDate);
        }*/
        while (true){
            readDate = reader.read();
            if (readDate==-1) break;
            System.out.println((char)readDate);
        }
        reader.close();
    }
}
