package org.opentutorials.javatutorials.ch8.sec05;

/**
 * Created by Nekisse_lee on 2017. 5. 25..
 */
public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();
    }
}
