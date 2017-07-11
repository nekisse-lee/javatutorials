package org.opentutorials.javatutorials.ch12_thread.sec07_deamon.exam01_deamon;

/**
 * Created by Nekisse_lee on 2017. 7. 10..
 */
public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        System.out.println("메인 스레드 종료");


    }
}
