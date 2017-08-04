package helloworld.thread.deamonthread;

/**
 * Created by Nekisse_lee on 2017. 8. 4..
 */
public class DeamonThread implements Runnable{


    @Override
    public void run() {
        while (true){
            System.out.println("데몬 스레드가 실행 중입니다.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new DeamonThread());
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드 종료");

    }



}
