package org.opentutorials.javatutorials.ch11.sec07_string.exam02_method;

import java.io.UnsupportedEncodingException;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class StringGetBytesExample {
    public static void main(String[] args) {
        String str = "안녕하세요";
        byte[] bytes1 = str.getBytes();

        System.out.println("bytes1.length: "  + bytes1.length);


        String str1 = new String(bytes1);
        System.out.println("byte1->String : " + str1);


        try {
            byte[] bytes2 = str.getBytes("UTF-8");
            System.out.println("bytes2.length: "  + bytes2.length);
            String str2 = new String(bytes2, "UTF-8");
            System.out.println("byte2->String : " + str2);

            byte[] bytes3 = str.getBytes("EUC-KR");
            System.out.println("bytes3.length: "  + bytes3.length);
            String str3 = new String(bytes3, "EUC-KR");
            System.out.println("byte3->String : " + str3);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
