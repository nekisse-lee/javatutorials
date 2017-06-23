package org.opentutorials.javatutorials.ch3.sec03.exam01_sign;

/**
 * Created by Nekisse_lee on 2017. 6. 21..
 */
public class SignOperationExample {
    public static void main(String[] args){
        int x = -100;
        int result1 = +x;
        int result2 = -x;

        System.out.println(result1);
        System.out.println(result2);

        short s = 100;
        //short result3 = -s;
        int result3 = -s;
        System.out.println(result3);
    }
}
