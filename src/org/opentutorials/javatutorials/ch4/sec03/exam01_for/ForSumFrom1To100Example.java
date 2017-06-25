package org.opentutorials.javatutorials.ch4.sec03.exam01_for;

/**
 * Created by Nekisse_lee on 2017. 6. 23..
 */
public class ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0 ;
        int i = 0;

        for ( i = 1; i <= 100; i++) {
            sum += i;

        }
        System.out.println("1~" +  (i-1) + "까지의 합 : " +sum);
    }
}
