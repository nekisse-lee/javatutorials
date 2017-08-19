package javatutorials.ch12_thread.sec05_state.exam01_state;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class TargetThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {}

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}

        for (int i = 0; i < 1000000000; i++) {}

    }
}
