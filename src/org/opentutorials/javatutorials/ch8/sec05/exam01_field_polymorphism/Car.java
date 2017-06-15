package org.opentutorials.javatutorials.ch8.sec05.exam01_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Car {
    Tire fronLefeTire = new HankookTire();
    Tire fronRightTire = new HankookTire();
    Tire backLefeTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run(){
        fronLefeTire.roll();
        fronRightTire.roll();
        backLefeTire.roll();
        backRightTire.roll();
    }
}


