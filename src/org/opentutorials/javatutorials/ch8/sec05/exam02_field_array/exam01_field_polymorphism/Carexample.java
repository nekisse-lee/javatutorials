package org.opentutorials.javatutorials.ch8.sec05.exam02_field_array.exam01_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Carexample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.run();

        mycar.tires[0] = new KumhoTire();

        mycar.tires[1]= new KumhoTire();

        mycar.run();


    }
}
