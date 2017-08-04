package helloworld.thread.wait_notify;

/**
 * Created by Nekisse_lee on 2017. 8. 4..
 */
public class ThreadB  extends  Thread{
    int total;


    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "를 더합니다.");
                total += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
}
