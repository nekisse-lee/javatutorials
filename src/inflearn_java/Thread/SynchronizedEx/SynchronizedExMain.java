package inflearn_java.Thread.SynchronizedEx;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class SynchronizedExMain {
    public static void main(String[] args) {
        SynchronizedEx synchronizedEx = new SynchronizedEx();

        Thread thread0 = new Thread(synchronizedEx, "A");
        Thread thread1 = new Thread(synchronizedEx, "B");


        thread0.start();
        thread1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("MainClass");
    }
}
