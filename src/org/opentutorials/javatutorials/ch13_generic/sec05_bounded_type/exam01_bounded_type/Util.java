package org.opentutorials.javatutorials.ch13_generic.sec05_bounded_type.exam01_bounded_type;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Util {
    public static <T extends Number> int compare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return Double.compare(v1, v2);


    }
}
