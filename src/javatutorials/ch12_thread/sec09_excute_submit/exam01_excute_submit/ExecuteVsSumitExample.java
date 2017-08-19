package javatutorials.ch12_thread.sec09_excute_submit.exam01_excute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Nekisse_lee on 2017. 7. 11..
 */
public class ExecuteVsSumitExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);


        for(int i = 0; i <10 ; i++) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
            int poolSize = threadPoolExecutor.getPoolSize();
            Runnable runnable = new Runnable(){
                @Override
                public void run() {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
                    int value = Integer.parseInt("삼");
                }
            };

            //executorService.execute(runnable);   예외 발생시 스레드를 지우고 새로하나를 더만듬..
            executorService.submit(runnable);         //  예외발생시  작업을 넘기고 새로운 작업을 불러서  스레드를 재사용한다

            Thread.sleep(10);
        }

        executorService.shutdown();



    }
}
