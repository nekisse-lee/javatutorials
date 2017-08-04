package helloworld.thread;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class MyThread1 extends Thread{
    String str;

    public MyThread1(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0 ; i <10; i++){
            System.out.println(str);

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
