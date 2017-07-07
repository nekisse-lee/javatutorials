package org.opentutorials.javatutorials.ch12_thread.sec06_.exam03_join;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {}

        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
