package org.opentutorials.javatutorials.ch7.sec05_final.exam02finalmethod;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class Car {
    public int speed;


    public void speedUp(){
        speed += 1;
    }

    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
