package org.opentutorials.javatutorials.ch12_thread.sec09_excute_submit.exam02_blocking;

import java.util.concurrent.*;

/**
 * Created by Nekisse_lee on 2017. 7. 12..
 */
public class CompletionServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        CompletionService<Integer> completionService =
                new ExecutorCompletionService<Integer>(executorService);

        System.out.println("[작업 처리 요청]");
        for (int i = 1; i<=3; i++){
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int j = 1; j <= 10; j++) {
                        sum+=j;
                    }
                    return sum;
                }
            });
        }
        System.out.println("[처리 완료된 작업 확인]");
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("[처리 결과] " + value);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        executorService.shutdownNow();

    }
}
