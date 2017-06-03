package org.opentutorials.javatutorials.ch6.sec14;

/**
 * Created by Nekisse_lee on 2017. 6. 3..
 */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //잘못된 속도변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도: " +myCar.getSpeed());

        //올바른 속도변경
        myCar.setSpeed(60);

        System.out.println("현재 속도: " +myCar.getSpeed());



        //멈춤
        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " +myCar.getSpeed());

    }
}
