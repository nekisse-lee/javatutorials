package org.opentutorials.javatutorials.ch11.sec07_string.exam01_constructor;

import java.io.IOException;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByetNo = System.in.read(bytes);

        String str = new String(bytes, 0, readByetNo-1);
        System.out.println(str);
    }
}
