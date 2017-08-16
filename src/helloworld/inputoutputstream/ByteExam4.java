package helloworld.inputoutputstream;

import javafx.application.Platform;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.nio.file.Path;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class ByteExam4 {
    public static void main(String[] args) {
        try(
                DataInputStream dis = new DataInputStream(new FileInputStream("Temp/humanpage.txt"));
                ){
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            double d = dis.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
