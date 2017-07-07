package org.opentutorials.javatutorials.ch12_thread.sec06_.exam03_join;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
    }
}
