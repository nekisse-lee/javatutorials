package javatutorials.ch8.sec05.exam04_casting;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }

}
