package javatutorials.ch12_thread.sec09_excute_submit.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Nekisse_lee on 2017. 7. 11..
 */
public class ResultByCallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );


        System.out.println("[작업 처리 요청]");

        Callable<Integer> task = new Callable<Integer>(){
            @Override
            public Integer call(){
                int sum = 0 ;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                return sum;
            }
        };
        Future<Integer> future = executorService.submit(task);

        try {
            int sum = future.get();
            System.out.println("[처리결과] " + sum );
            System.out.println("[작업 처리 완료]");
        }catch (Exception e) {
            System.out.println("[실행 예외 발생함] " + e.getMessage());
        }

        executorService.shutdown();

    }
}
