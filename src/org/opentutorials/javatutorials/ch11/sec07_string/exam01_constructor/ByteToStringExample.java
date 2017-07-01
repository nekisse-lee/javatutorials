package org.opentutorials.javatutorials.ch11.sec07_string.exam01_constructor;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class ByteToStringExample {
    public static void main(String[] args){
        byte[] bytes = {72, 101, 108, 108, 111, 32 ,74, 97, 118, 97};
        String str1 = new String(bytes);
        System.out.println(str1);
    }
}
