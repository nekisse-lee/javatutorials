package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec05_runnable.exam01_runnable;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class RunnableExample {
    public static void main(String[] args) {
/*

        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };


        Thread thread  = new Thread(runnable);
        thread.start();
*/
        Thread thread  = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        thread.start();

    }
}
