package org.opentutorials.javatutorials.ch8.sec02.exam03_abstract_method;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public interface RemoteControl {
    int MAX_VALUME = 10;
    int MIN_VALUME = 0;


     // 인터페이스의 추상메소드 선언
    //    public abtract 자동추가되어서 쓸필요는없다
   public abstract void trunOn();
   public abstract void trunOff();
   public abstract void setVolume(int volume);


}
