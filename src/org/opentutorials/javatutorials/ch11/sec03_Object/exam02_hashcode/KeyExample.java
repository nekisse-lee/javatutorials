package org.opentutorials.javatutorials.ch11.sec03_Object.exam02_hashcode;

import java.util.HashMap;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class KeyExample {
    public static void main(String[] args) {

        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        hashMap.put(new Key(1), "홍길동");

        String value = hashMap.get(new Key(1));
        System.out.println(value);


    }
}
