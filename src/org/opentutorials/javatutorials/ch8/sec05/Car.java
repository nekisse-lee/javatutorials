package org.opentutorials.javatutorials.ch8.sec05;

/**
 * Created by Nekisse_lee on 2017. 5. 25..
 */
public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backrightTire = new HankookTire();

    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backrightTire.roll();
    }
}
