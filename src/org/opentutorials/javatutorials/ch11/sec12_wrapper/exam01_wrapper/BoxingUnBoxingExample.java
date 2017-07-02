package org.opentutorials.javatutorials.ch11.sec12_wrapper.exam01_wrapper;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("100");

        Integer obj3 = Integer.valueOf(100);
        Integer obj4 = Integer.valueOf("100");

        //Unboxing
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();
        int value4 = obj4.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);




    }
}
