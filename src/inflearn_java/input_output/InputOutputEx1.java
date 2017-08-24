package inflearn_java.input_output;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class InputOutputEx1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream("Temp/jain.txt");
            os = new FileOutputStream("Temp/jain_copy.txt");
            while (true) {
                int i = is.read();
                if (i == -1) {
                    break;
                }
                os.write(i);

            }
        } catch (Exception e) {
            e.getMessage();
        }finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }
}
