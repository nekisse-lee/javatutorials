package org.opentutorials.javatutorials.ch12_thread.sec06_.exam04_wait_notify;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();


        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();



    }
}
