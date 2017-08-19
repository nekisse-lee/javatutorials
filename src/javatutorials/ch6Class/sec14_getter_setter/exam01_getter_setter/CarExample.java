package javatutorials.ch6Class.sec14_getter_setter.exam01_getter_setter;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();


      myCar.setSpeed(-50);

        System.out.println("현재 속도 : " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도 : " + myCar.getSpeed());



    }
}
