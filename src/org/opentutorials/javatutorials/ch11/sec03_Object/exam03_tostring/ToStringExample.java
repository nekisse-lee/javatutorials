package org.opentutorials.javatutorials.ch11.sec03_Object.exam03_tostring;

import java.util.Date;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class ToStringExample  {
    public static void main(String[] args) {

        Object obj1 = new Object();
        Date obj2 = new Date();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}
