package org.opentutorials.javatutorials.ch7.sec05_final;

/**
 * Created by Nekisse_lee on 2017. 5. 22..
 */
public class SportsCar extends Car{
    @Override
    public void speedUp() {speed += 10;}


    // final 로 인해 오버라이드 불가능
//    @Override
//    public void stop(){
//        System.out.println("스포츠카를 멈춘");
//        speed = 0;
//    }
}
