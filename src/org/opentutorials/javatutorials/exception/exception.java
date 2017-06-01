package org.opentutorials.javatutorials.exception;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 5. 30..
 */
public class exception {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String input = null;
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(input);

    }
}
