package inflearn_java.Thread.runnable;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class RunnableClassEx implements Runnable {

    int testNum = 0;

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName() == "A") {
                System.out.println("===============================");
                testNum++;
            }
            System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum: " + testNum);

            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }

    }
}
