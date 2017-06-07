package org.opentutorials.javatutorials.ch11.sec03.exam06finalize;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class CounterExample {
    public static void main(String[] args) {
        Counter counter = null;
        for (int i = 1; i <= 50; i++) {
            counter = new Counter(i);
            counter = null;
            System.gc();
        }
    }

}
