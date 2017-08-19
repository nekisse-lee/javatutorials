package javatutorials.ch6Class.sec14_getter_setter.exam01_getter_setter;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class Car {
    private int speed;
    private boolean stop;


    public int getSpeed() {
        return speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setSpeed(int speed) {
        if (speed < 0){
            speed = 0;
            return;
        }else{
            this.speed = speed;
        }
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true){
            speed = 0;
        }
    }
}
