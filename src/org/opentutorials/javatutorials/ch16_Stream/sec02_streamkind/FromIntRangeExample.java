package org.opentutorials.javatutorials.ch16_Stream.sec02_streamkind;

import java.util.stream.IntStream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class FromIntRangeExample {
    public static int sum;


    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }
}
