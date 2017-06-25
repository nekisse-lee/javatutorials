package org.opentutorials.javatutorials.ch4.sec03.exam02_while;

/**
 * Created by Nekisse_lee on 2017. 6. 23..
 */
public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 100){
            sum += 1;
            i++;

        }
        System.out.println("1~" + (i - 1) + "까지의 합: " + sum);
    }



}
