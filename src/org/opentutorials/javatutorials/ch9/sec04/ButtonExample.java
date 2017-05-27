package org.opentutorials.javatutorials.ch9.sec04;

/**
 * Created by Nekisse_lee on 2017. 5. 26..
 */
public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new CallListener());
        btn.touch();

        btn.setOnClickListener(new MessageListener());
        btn.touch();

    }
}
