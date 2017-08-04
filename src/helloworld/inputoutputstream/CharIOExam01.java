package helloworld.inputoutputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class CharIOExam01 {
    public static void main(String[] args) {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
              line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(line);
    }

}
