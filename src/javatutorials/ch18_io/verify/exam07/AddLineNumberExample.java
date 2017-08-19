package javatutorials.ch18_io.verify.exam07;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Nekisse_lee on 2017. 7. 30..
 */
public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec05/exam04_bufferdreader/BufferedReaderExample.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;

        while ((rowData = br.readLine()) != null){
            System.out.println(++rowNumber + ": " + rowData);
        }

        br.close();
        fr.close();

    }
}
