package inflearn_java.input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class OutputClass {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
             os = new FileOutputStream("Temp/jaout.txt");
            String str = "오늘 날씨는 아주 좋습니다.";
            byte[] bytes = str.getBytes();
            os.write(bytes);
        } catch (Exception e) {
            e.getMessage();
        }finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }

    }
}
