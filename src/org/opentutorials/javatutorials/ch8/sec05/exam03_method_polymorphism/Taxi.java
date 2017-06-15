package org.opentutorials.javatutorials.ch8.sec05.exam03_method_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Taxi implements Vehicle{

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
