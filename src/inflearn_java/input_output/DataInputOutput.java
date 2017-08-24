package inflearn_java.input_output;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class DataInputOutput {
    public static void main(String[] args) {
        InputStream is = null;
        DataInput dis = null;

        OutputStream os = null;
        DataOutputStream dos = null;

        try {
            is = new FileInputStream("Temp/jain.txt");
            dis = new DataInputStream(is);
            String str = dis.readUTF();

            os = new FileOutputStream("Temp/jain_str_copy.txt");
            dos = new DataOutputStream(os);
            dos.writeUTF(str);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                dos.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
