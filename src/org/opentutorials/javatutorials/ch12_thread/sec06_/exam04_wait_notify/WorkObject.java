package org.opentutorials.javatutorials.ch12_thread.sec06_.exam04_wait_notify;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class WorkObject {
    public synchronized  void methodA(){
        System.out.println("ThreadA의 methodA()작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {}


    }

    public synchronized void methodB(){
        System.out.println("ThreadA의 methodB()작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {}

    }
}
