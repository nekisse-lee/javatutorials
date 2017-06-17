package org.opentutorials.javatutorials.ch9.sec04.exam01_nestedinterface;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class CallListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
