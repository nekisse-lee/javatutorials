package javatutorials.ch7.sec04.exam01_overriding;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class Computer extends Calculator{

    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI*r*r;
    }
}
