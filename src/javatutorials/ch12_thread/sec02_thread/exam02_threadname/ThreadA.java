package javatutorials.ch12_thread.sec02_thread.exam02_threadname;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class ThreadA extends Thread {

    public ThreadA(){
        setName("ThradA");
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i ++){
            System.out.println(getName() + "가 출력한 내용");
        }


    }
}
