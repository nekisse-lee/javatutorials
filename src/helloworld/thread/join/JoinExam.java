package helloworld.thread.join;

/**
 * Created by Nekisse_lee on 2017. 8. 4..
 */
public class JoinExam {
    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();

        myThread5.start();

        System.out.println("시작");

        try {
            myThread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("종료!");


    }

}
