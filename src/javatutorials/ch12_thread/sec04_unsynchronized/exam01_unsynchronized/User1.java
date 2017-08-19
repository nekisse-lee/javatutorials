package javatutorials.ch12_thread.sec04_unsynchronized.exam01_unsynchronized;

/**
 * Created by Nekisse_lee on 2017. 7. 7..
 */
public class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(100);
    }
}
