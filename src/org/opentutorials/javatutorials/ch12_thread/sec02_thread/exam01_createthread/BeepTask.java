package org.opentutorials.javatutorials.ch12_thread.sec02_thread.exam01_createthread;

import java.awt.*;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class BeepTask implements Runnable{
    @Override
    public void run() {
        //비프음을 5번 반복해서 소리나게 하는 작업
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try{Thread.sleep(500);}catch (Exception e){}
        }

    }
}
