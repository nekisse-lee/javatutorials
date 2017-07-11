package org.opentutorials.javatutorials.ch12_thread.sec06_.exam06_stop;

/**
 * Created by Nekisse_lee on 2017. 7. 9..
 */
public class StopFlagExample {
    public static void main(String[] args){
        PrintThread1 printThread1 = new PrintThread1();

        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        printThread1.setStop(true);


    }
}
