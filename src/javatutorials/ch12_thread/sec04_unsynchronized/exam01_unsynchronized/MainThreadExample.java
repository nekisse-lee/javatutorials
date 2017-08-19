package javatutorials.ch12_thread.sec04_unsynchronized.exam01_unsynchronized;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class MainThreadExample {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();


        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }

}
