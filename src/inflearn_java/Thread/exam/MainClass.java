package inflearn_java.Thread.exam;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class MainClass {
    public static void main(String[] args) {

        VoteThread voteThread1 = new VoteThread();
        VoteThread voteThread2 = new VoteThread();
        VoteThread voteThread3 = new VoteThread();


        Thread thread1 = new Thread(voteThread1, "서울");
        Thread thread2 = new Thread(voteThread2, "대전");
        Thread thread3 = new Thread(voteThread3, "부산");



        thread1.start();
        thread2.start();
        thread3.start();

    }
}
