package org.opentutorials.javatutorials.ch11.sec12_wrapper.exam01_wrapper;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        //자동 박싱
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        //대입시 자동 Unboxing
        int value = obj;
        System.out.println("value : " + value);

        //연산시 자동 Unboxing
        int result = obj + 100;
        System.out.println("result :" + result);
    }
}
