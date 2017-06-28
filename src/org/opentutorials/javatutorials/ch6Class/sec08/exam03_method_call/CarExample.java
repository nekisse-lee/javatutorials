package org.opentutorials.javatutorials.ch6Class.sec08.exam03_method_call;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTrunOn();
        myCar.run();
        int speed = myCar.getspeed();
        System.out.println("현재속도 : " + speed + "km/h");
    }
}
