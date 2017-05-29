package test.television.samsung;

import test.television.Television;

/**
 * Created by Nekisse_lee on 2017. 5. 27..
 */
public abstract class SamsungTelevision implements Television{

    @Override
    public void turnOn() {
        System.out.println("Samsung Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung Tv Off");
    }

    abstract public void actionSamsung();
}
