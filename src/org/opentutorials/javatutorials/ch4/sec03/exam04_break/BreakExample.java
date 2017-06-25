package org.opentutorials.javatutorials.ch4.sec03.exam04_break;

/**
 * Created by Nekisse_lee on 2017. 6. 25..
 */
public class BreakExample {
    public static void main(String[] args){
        while (true){
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);
            if(num==6){
                break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
