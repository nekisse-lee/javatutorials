package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec03.exam02_arguments;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x)->{
            int result = x * 5;
            System.out.println(result);
        };

        fi.method(2);


        fi = (x)-> System.out.println(x * 5);
        fi.method(2);

        fi = x-> System.out.println(x * 5);
        fi.method(2);
    }
}
