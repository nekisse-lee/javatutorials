package org.opentutorials.javatutorials.ch11.sec13_math.exam01_math;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class MathRandomExample {
    public static void main(String[] args){
        int num = (int) (Math.random()*6)+1;
        System.out.println("주사위 눈 : " + num);
    }
}
