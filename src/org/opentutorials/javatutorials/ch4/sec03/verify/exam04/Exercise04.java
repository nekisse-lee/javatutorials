package org.opentutorials.javatutorials.ch4.sec03.verify.exam04;

/**
 * Created by Nekisse_lee on 2017. 6. 25..
 */
public class Exercise04 {
    public static void main(String[] args) {

        while (true){
            int num1 = (int)(Math.random()*6)+1;
            int num2 = (int)(Math.random()*6)+1;
            System.out.println("(" + num1 + "," + num2 +")");
            if ((num1+num2)==5){
                break;
            }
        }
    }
}
