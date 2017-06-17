package org.opentutorials.javatutorials.ch9.sec04.exam01_nestedinterface;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new CallListener());
        btn.setOnClickListener(new MessageListener());
        btn.touch();

    }
}
