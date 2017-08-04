package helloworld.thread.wait_notify;

/**
 * Created by Nekisse_lee on 2017. 8. 4..
 */
public class ThreadA {
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();

        synchronized (threadB){
            try{
                System.out.println("threadB가 완료될때까지 기다립니다");
                threadB.wait();
            }catch (Exception e){
                e.printStackTrace();
            }

            System.out.println("Total is: " + threadB.total);

        }

    }
}
