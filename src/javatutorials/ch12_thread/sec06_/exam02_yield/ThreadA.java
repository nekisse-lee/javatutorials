package javatutorials.ch12_thread.sec06_.exam02_yield;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class ThreadA extends  Thread {
    public boolean stop = false;
    public boolean work = true;


    @Override
    public void run() {
        while (!stop){
            if (work){
                System.out.println("ThreadA 작업 내용");
            }else{
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");

    }
}
