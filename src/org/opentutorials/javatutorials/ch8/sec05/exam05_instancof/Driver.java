package org.opentutorials.javatutorials.ch8.sec05.exam05_instancof;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Driver {
    public void drive(Vehicle vehicle){
     if(vehicle instanceof Bus){
         Bus bus = (Bus) vehicle;
         bus.checkFare();
     }
         vehicle.run();

    }
}
