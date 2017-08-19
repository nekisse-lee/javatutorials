package javatutorials.ch12_thread.sec08_thread_group.exam01_threadgroup;

/**
 * Created by Nekisse_lee on 2017. 7. 11..
 */
public class WorkThread extends Thread {
    public WorkThread(ThreadGroup threadGroup, String threadName){
        super(threadGroup, threadName);
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
                break;
            }
        }
        System.out.println(getName() + "종료됨");

    }
}
