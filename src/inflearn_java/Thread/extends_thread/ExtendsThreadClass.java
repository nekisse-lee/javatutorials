package inflearn_java.Thread.extends_thread;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class ExtendsThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
