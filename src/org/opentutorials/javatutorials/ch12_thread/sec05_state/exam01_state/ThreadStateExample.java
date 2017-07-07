package org.opentutorials.javatutorials.ch12_thread.sec05_state.exam01_state;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class ThreadStateExample {
    public static void main(String[] args){
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }
}
