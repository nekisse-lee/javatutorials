package org.opentutorials.javatutorials.ch11.sec03.exam02;

import java.util.HashMap;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();
        hashMap.put(new Key(1), "홍길동");

        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }

}
