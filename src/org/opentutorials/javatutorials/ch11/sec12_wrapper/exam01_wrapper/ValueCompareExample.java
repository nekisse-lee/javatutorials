package org.opentutorials.javatutorials.ch11.sec12_wrapper.exam01_wrapper;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class ValueCompareExample {
    public static void main(String[] args) {
        System.out.println("[-128 ~ 127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==결과: " + (obj1==obj2));       //wrapper 클래스에선 사용하지 않기.
        System.out.println("언박싱후 == 결과: " + (obj1.intValue()==obj2.intValue()));
        System.out.println("equals() == 결과: " + (obj1.equals(obj2)));

        System.out.println();

        System.out.println("[-128 ~ 127 범위값일 경우]");
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==결과: " + (obj3==obj4));    //wrapper 클래스에선 사용하지 않기.
        System.out.println("언박싱후 == 결과: " + (obj3.intValue()==obj4.intValue()));
        System.out.println("equals() == 결과: " + (obj3.equals(obj4)));

    }
}
