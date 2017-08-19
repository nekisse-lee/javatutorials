package javatutorials.ch8.sec03.exam01_name_implement_class;

/**
 * Created by Nekisse_lee on 2017. 6. 13..
 */
public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();

        rc.trunOn();
        rc.trunOff();

    }

}
