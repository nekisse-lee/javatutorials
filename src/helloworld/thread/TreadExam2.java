package helloworld.thread;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class TreadExam2 {
    public static void main(String[] args) {
        MyThread2 t1 =  new MyThread2("*");
        MyThread2 t2 =  new MyThread2("-");

        Thread thread1 =  new Thread(t1);
        Thread thread2 =  new Thread(t2);
        thread1.start();
        thread2.start();

        System.out.println(Thread.currentThread() + "        main Thread end");
    }
}
