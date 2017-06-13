package org.opentutorials.javatutorials.ch8.sec02.exam02_constant_field;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public interface RemoteControl {
    //인터페이스 상수는 public static final 이 무조건.
    //기본값이 무조건 있어야한다
    // static{ MIN_VALUE = 0;  }    정적블록에서 초기화 불가

    int MAX_VALUME = 10;
    int MIN_VALUME = 0;


}
