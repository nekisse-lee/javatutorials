package org.opentutorials.javatutorials.ch12_thread.sec05_state.exam01_state;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class StatePrintThread extends Thread {
    private Thread targetThread;

    StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while (true) {
            Thread.State state = targetThread.getState();
            System.out.println("타겟 스레드 상태 : " + state);

            if (state == Thread.State.NEW) {
                targetThread.start();
            }

            if (state == Thread.State.TERMINATED) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
