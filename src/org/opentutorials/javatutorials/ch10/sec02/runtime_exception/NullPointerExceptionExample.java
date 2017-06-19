package org.opentutorials.javatutorials.ch10.sec02.runtime_exception;

/**
 * Created by Nekisse_lee on 2017. 6. 19..
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());   // NullPointerException
    }
}
