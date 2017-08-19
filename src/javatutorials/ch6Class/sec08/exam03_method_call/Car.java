package javatutorials.ch6Class.sec08.exam03_method_call;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class Car {
    int speed;

    int getspeed(){
        return speed;
    }

    void keyTrunOn(){
        System.out.println("키를 돌립니다.");
    }

    void run(){
        for (int i = 0; i <= 50 ; i+=10){
            speed = i;
            System.out.println("달립니다. (시속 : " + speed + "km/h)");
        }
    }
}
