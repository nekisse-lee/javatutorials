package org.opentutorials.javatutorials.ch8.sec05.exam04_casting;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();


    }
}
