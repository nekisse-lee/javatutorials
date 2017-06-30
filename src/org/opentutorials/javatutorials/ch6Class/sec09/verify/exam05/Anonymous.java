package org.opentutorials.javatutorials.ch6Class.sec09.verify.exam05;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    public void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        localVar.run();
    }

    public void method2() {
    }
}
