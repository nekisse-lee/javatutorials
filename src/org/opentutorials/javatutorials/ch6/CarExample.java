package org.opentutorials.javatutorials.ch6;

/**
 * Created by Nekisse_lee on 2017. 5. 20..
 */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");
    }
}
