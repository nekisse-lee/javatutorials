package org.opentutorials.javatutorials.ch12_thread.sec04_unsynchronized.exam02_synchronized;

/**
 * Created by Nekisse_lee on 2017. 7. 4..
 */
public class User1 extends Thread{
     private Calculator calculator ;

    public void setCalculator(Calculator calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }


    @Override
    public void run() {
        calculator.setMemory(100);
    }
}
