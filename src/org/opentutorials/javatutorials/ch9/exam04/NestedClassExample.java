package org.opentutorials.javatutorials.ch9.exam04;

/**
 * Created by Nekisse_lee on 2017. 5. 28..
 */
public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        Car.Tire tire =  myCar.new Tire();
        Car.Engine engine = new Car.Engine();
    }
}
