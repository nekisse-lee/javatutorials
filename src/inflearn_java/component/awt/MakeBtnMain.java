package inflearn_java.component.awt;

import java.awt.*;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class MakeBtnMain {
    public static void main(String[] args) {
        MakeBtn btn = new MakeBtn();
        //btn.pack();
        btn.setSize(new Dimension(200,200));
        btn.setVisible(true);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            btn.setVisible(false);
            btn.dispose();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.exit(0);

    }

}
