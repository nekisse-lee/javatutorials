package org.opentutorials.javatutorials.ch6.sec08;

/**
 * Created by Nekisse_lee on 2017. 6. 2..
 */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(0);

        boolean gasStage = myCar.isLeftGas();
        if(gasStage){
            System.out.println("출발합니다.");
            myCar.run();
        }

        if(myCar.isLeftGas()){
            System.out.println("gas를 주입할 필요가 없습니다.");
        }else{
            System.out.println("gas를 주입하세요");
        }


    }
}
