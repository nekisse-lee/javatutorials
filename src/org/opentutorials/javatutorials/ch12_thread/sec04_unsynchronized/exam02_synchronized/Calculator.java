package org.opentutorials.javatutorials.ch12_thread.sec04_unsynchronized.exam02_synchronized;

/**
 * Created by Nekisse_lee on 2017. 7. 4..
 */
public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
