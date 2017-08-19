package javatutorials.ch7.sec07methodpolymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class Taxi extends Vehicle{
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
