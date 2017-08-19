package javatutorials.ch12_thread.sec06_.exam06_stop;

/**
 * Created by Nekisse_lee on 2017. 7. 9..
 */
public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
