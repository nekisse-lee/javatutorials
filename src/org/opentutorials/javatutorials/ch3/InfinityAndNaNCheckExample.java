package org.opentutorials.javatutorials.ch3;

/**
 * Created by Nekisse_lee on 2017. 5. 16..
 */
public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {

        int x = 5;
        double y = 0.0;

        double z = x / y ;
//        double z = x % y;

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));

        System.out.println(z + 2);
    }
}
