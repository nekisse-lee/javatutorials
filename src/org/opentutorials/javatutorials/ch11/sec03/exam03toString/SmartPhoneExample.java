package org.opentutorials.javatutorials.ch11.sec03.exam03toString;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);


        System.out.println(myPhone);


    }
}
