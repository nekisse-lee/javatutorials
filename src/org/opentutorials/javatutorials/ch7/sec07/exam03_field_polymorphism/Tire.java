package org.opentutorials.javatutorials.ch7.sec07.exam03_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class Tire {
    public int maxRotation;  // 최대회전수

    public int accumulatedRotation;  //적
    public  String location;  // 타이어 위


    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }


    public boolean roll(){
        ++accumulatedRotation;
        if (accumulatedRotation< maxRotation){
            System.out.println(location + " Tire 수명 " + (maxRotation-accumulatedRotation));
            return true;
        }else{
            System.out.println("**** " + location + " Tire 펑크 ***");
            return false;
        }
    }

}
