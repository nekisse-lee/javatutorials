package javatutorials.ch12_thread.sec03_priority.exam01_priority;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class CalcThread extends Thread {
    public CalcThread(String name){
        setName(name);
    }

    public void run() {
        for(int i=0; i<2000000000; i++) {
        }
        System.out.println(getName());
    }
}
