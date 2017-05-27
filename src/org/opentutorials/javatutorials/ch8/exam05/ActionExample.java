package org.opentutorials.javatutorials.ch8.exam05;

/**
 * Created by Nekisse_lee on 2017. 5. 26..
 */
public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다");
            }
        };







                action.work();
    }
}
