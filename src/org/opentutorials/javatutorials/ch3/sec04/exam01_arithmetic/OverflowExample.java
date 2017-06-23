package org.opentutorials.javatutorials.ch3.sec04.exam01_arithmetic;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class OverflowExample {
    public static void main(String[] args){
//        int x = 1000000;
//        int y = 1000000;
//
//        int z = x * y ;
//        System.out.println(z);

        long x = 1000000;
        long y = 1000000;
        long z = x * y;
        System.out.println(z);
    }
}
