package org.opentutorials.javatutorials.ch7.sec04.exam02super;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class SupersonicAriplaneExample {
    public static void main(String[] args) {

        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NOMARL;
        sa.fly();
        sa.land();

    }
}
