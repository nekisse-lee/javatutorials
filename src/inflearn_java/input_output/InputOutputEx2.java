package inflearn_java.input_output;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class InputOutputEx2 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        byte[] bytes = new byte[5];
        try {
            is = new FileInputStream("Temp/jain.txt");
            os = new FileOutputStream("Temp/jain_copy2.txt");

            while (true) {
                int count = is.read(bytes);
                if (count == -1) {
                    break;
                }
                os.write(bytes,0,count);
            }

        } catch (IOException e) {
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
                    e.printStackTrace();
                }
            }
        }


    }
}
