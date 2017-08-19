package javatutorials.ch12_thread.sec06_.exam04_wait_notify;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class ThreadA extends Thread {
    private WorkObject workObject;
    public ThreadA(WorkObject workObject){
        this.workObject = workObject;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
            
        }
    }
}
