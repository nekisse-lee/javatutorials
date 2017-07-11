package org.opentutorials.javatutorials.ch12_thread.sec08_thread_group.exam01_threadgroup;

import java.util.Map;
import java.util.Set;

/**
 * Created by Nekisse_lee on 2017. 7. 11..
 */
public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();

        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();


        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads){
            System.out.println("Name: " + thread.getName() + ((thread.isDaemon())?"(데몬)":"(주)"));
            System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
            System.out.println();
        }

    }
}
