package org.opentutorials.javatutorials.ch7.sec07methodpolymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
