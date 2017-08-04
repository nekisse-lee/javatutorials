package helloworld.inputoutputstream;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class CharIOExam02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
                try {
                    br = new BufferedReader(new FileReader("src/helloworld/inputoutputstream/CharIOExam02.java"));
                    pw = new PrintWriter(new FileWriter("Temp/test.txt"));

                    String line = null;
                    while ((line = br.readLine()) != null){
                        pw.println(line);
                    }

                }catch (Exception e ){
                    e.printStackTrace();
                }finally {
                    pw.close();
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

    }

}
