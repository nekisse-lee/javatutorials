package org.opentutorials.javatutorials.ch9.sec04.exam01_nestedinterface;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new CallListener());
        btn.touch();

        btn.setOnClickListener(new MessageListener());
        btn.touch();


        //익명구현객체
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("사진을 찍습니다.");
            }
        });
        btn.touch();
    }
}
