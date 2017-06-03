package org.opentutorials.javatutorials.ch6.sec14;

/**
 * Created by Nekisse_lee on 2017. 6. 3..
 */
public class Car {
    //필드
    private int speed;
    private boolean stop;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed<0){
            this.speed = 0;
            return;
        }else{
            this.speed=speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
