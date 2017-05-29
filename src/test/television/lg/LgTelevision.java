package test.television.lg;

import test.television.Television;

/**
 * Created by Nekisse_lee on 2017. 5. 27..
 */
public abstract class LgTelevision implements Television {

    @Override
    public void turnOn() {
        System.out.println("Lg Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Lg Tv Off");
    }
}

