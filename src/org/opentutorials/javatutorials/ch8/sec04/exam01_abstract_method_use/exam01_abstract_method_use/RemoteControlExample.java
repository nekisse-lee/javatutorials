package org.opentutorials.javatutorials.ch8.sec04.exam01_abstract_method_use.exam01_abstract_method_use;

/**
 * Created by Nekisse_lee on 2017. 6. 13..
 */
public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.trunOn();
        rc.trunOff();

        rc = new Audio();
        rc.trunOn();
        rc.trunOff();


    }

}
