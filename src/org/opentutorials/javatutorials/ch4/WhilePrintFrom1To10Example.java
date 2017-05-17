package org.opentutorials.javatutorials.ch4;

/**
 * Created by Nekisse_lee on 2017. 5. 16..
 */
public class WhilePrintFrom1To10Example {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        while (i<=100){
            sum += i;
            i++;
        }
        System.out.println("1~" +(i-1) + "합 : "+ sum);
        System.out.println(i);
    }
}
