package javatutorials.ch12_thread.sec06_.exam06_stop;

/**
 * Created by Nekisse_lee on 2017. 7. 9..
 */
public class PrintThread2 extends Thread {
    @Override
    public void run() {
       /* try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {

        }*/

        while (true) {
            System.out.println("실행 중");
        if (isInterrupted()){   //    Thread.interrupted() 도 사용가능
            break;
        }
        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }

}
