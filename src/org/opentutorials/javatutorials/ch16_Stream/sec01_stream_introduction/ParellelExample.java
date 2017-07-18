package org.opentutorials.javatutorials.ch16_Stream.sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class ParellelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "람다식", "박병렬");

        //순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(name -> print(name));    //   ->ParellelExample::print  메소드 참조가능

        //병렬 처리

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(str -> print(str));
    }




    private static void print(String str) {
        System.out.println(str + ":" + Thread.currentThread().getName());





    }
}
