package inflearn_java.Thread.exam;

import java.util.Random;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class VoteThread implements Runnable {
    int targetNum = 100;
    int sum = 0;
    Random random = new Random();

    @Override
    public void run() {
        StringBuffer sb = new StringBuffer();

        while (true) {
            sum = sum + random.nextInt(10);
            sb.delete(0, sb.toString().length());

            if (sum >= targetNum) {
                sum = 100;
                for (int i = 0; i < sum; i++) {
                    sb.append("*");
                }
                System.out.println(Thread.currentThread().getName() + " 개표율: " + sum + "\t: " + sb);
                break;
            } else {
                for (int i = 0; i < sum; i++) {
                    sb.append("*");
                }
                System.out.println(Thread.currentThread().getName() + " 개표율: " + sum + "\t: " + sb);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
