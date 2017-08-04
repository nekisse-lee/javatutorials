package helloworld.inputoutputstream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class ByteExam2 {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/helloworld/inputoutputstream/ByteExam1.java");
            fos = new FileOutputStream("Temp/byte.txt");


            int readCount = -1;
            byte[] buffer = new byte[512];
            while ((readCount = fis.read(buffer)) != -1){
                fos.write(buffer,0,readCount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-starTime);
    }
}
