package javatutorials.ch12_thread.sec06_.exam01_sleep;

import java.awt.*;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {}
        }



    }
}
