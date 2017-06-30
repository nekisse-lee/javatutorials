package org.opentutorials.javatutorials.ch11.sec03_Object.exam06_finalize;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class finalizeExample {
    public static void main(String[] args) {
        Counter counter = null;

        for (int i= 1; i<=50; i ++){
            counter = new Counter(i);
            counter = null;
            System.gc();


        }


    }
}
