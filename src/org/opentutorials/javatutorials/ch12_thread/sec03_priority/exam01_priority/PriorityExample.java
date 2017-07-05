package org.opentutorials.javatutorials.ch12_thread.sec03_priority.exam01_priority;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class PriorityExample {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            Thread thread = new CalcThread("thread" + i);
            if(i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}

