package inflearn_java.Thread.runnable;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class RunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("RunnableClass");

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
