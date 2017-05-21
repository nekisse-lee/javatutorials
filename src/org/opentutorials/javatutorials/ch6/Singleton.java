package org.opentutorials.javatutorials.ch6;

/**
 * Created by Nekisse_lee on 2017. 5. 20..
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
}

