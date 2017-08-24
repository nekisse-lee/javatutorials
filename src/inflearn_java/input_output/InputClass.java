package inflearn_java.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class InputClass {
    public static void main(String[] args){
        InputStream is = null;
        try {
             is = new FileInputStream("Temp/jain.txt");
            while (true) {
                int i = is.read();
                System.out.println("데이터" + i);
                if (i == -1) {
                    break;
                }
            }
            is.close();
        } catch (Exception e) {
            e.getMessage();
        }finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }
}
