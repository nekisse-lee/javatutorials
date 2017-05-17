package org.opentutorials.javatutorials.ch4;

/**
 * Created by Nekisse_lee on 2017. 5. 17..
 */
public class test2 {
    public static void main(String[] args) {

        while(true){
            int num1 = (int)(Math.random()*6) + 1;
            int num2 = (int)(Math.random()*6) + 1;
            System.out.println("("+num1+ "," +num2 +")");
            if(num1 + num2 == 5){
                break;
            }

        }
    }
}
