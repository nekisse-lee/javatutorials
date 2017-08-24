package inflearn_java.Thread.runnable;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class RunnableClassMain {
    public static void main(String[] args) {

        RunnableClass runnableClass = new RunnableClass();

        Thread thread = new Thread(runnableClass,"A");
        thread.start();

        System.out.println(Thread.currentThread().getName());

    }

}
