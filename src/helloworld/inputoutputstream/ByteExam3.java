package helloworld.inputoutputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class ByteExam3 {
    public static void main(String[] args) {
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("Temp/humanpage.txt"));
                ){

            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);


        }catch(Exception e){
             e.printStackTrace();
        }
    }
}
