package inflearn_java.Thread.runnable;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class RunnableClassExMain {
    public static void main(String[] args) {

        RunnableClassEx runnableClassEx0 = new RunnableClassEx();
        RunnableClassEx runnableClassEx1 = new RunnableClassEx();


        Thread thread0 = new Thread(runnableClassEx0, "A");
        Thread thread1 = new Thread(runnableClassEx1, "B");

        thread0.start();
        thread1.start();

        System.out.println(Thread.currentThread().getName());
    }
}
