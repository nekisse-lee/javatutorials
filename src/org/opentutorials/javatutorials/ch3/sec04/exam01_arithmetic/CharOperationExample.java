package org.opentutorials.javatutorials.ch3.sec04.exam01_arithmetic;

/**
 * Created by Nekisse_lee on 2017. 6. 21..
 */
public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1;
        int result = c2 + 1;
        System.out.println(result);

        char c3 = (char) result;

    }
}
