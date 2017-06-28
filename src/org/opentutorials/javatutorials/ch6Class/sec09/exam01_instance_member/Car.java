package org.opentutorials.javatutorials.ch6Class.sec09.exam01_instance_member;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class Car {
    String model;
    int speed;

    Car(String model){
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        for (int i = 10; i <=50 ; i += 10){
            this.setSpeed(i);
            System.out.println(this.model + "달립니다.(시속: "  + speed + "km/h)");
        }
    }



}
