package org.opentutorials.javatutorials.ch8.sec05.exam05_instancof;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);


    }
}
