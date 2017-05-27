package org.opentutorials.javatutorials.ch9.sec04;

/**
 * Created by Nekisse_lee on 2017. 5. 26..
 */
public class MessageListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
