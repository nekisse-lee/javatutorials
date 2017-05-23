package org.opentutorials.javatutorials.ch7.sec05_final;

/**
 * Created by Nekisse_lee on 2017. 5. 22..
 */
public class Car {

    public int speed;


    public void speedUp(){ speed += 1;}

    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
