package org.opentutorials.javatutorials.ch11.sec03.exam03toString;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class ToStringEample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}
