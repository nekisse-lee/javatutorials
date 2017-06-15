package org.opentutorials.javatutorials.ch8.sec05.exam03_method_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
