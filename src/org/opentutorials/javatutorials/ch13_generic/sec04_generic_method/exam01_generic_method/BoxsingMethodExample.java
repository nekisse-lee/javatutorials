package org.opentutorials.javatutorials.ch13_generic.sec04_generic_method.exam01_generic_method;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class BoxsingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxsing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = Util.boxsing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);



    }
}
