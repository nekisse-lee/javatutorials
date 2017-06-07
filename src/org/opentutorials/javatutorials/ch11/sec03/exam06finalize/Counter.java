package org.opentutorials.javatutorials.ch11.sec03.exam06finalize;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class Counter {
    private int num;

    public Counter(int num){
        this.num = num;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println(num+"번 객체의 finalize가 실행됨");
    }
}
