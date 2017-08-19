package javatutorials.ch12_thread.sec04_unsynchronized.exam02_synchronized;

/**
 * Created by Nekisse_lee on 2017. 7. 4..
 */
public class User2 extends Thread{
     private Calculator calculator ;

    public void setCalculator(Calculator calculator) {
        this.setName("User2");
        this.calculator = calculator;
    }


    @Override
    public void run() {
        calculator.setMemory(50);
    }
}
