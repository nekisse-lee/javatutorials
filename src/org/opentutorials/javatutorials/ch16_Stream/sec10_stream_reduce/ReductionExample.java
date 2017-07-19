package org.opentutorials.javatutorials.ch16_Stream.sec10_stream_reduce;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동",92),
                new Student("신용권",85),
                new Student("감자바",88)
        );

        int sum1 = studentList.stream()
                .mapToInt(s->s.getScore())
                .sum();
        System.out.println();

        int sum2 = studentList.stream()
                .mapToInt(s->s.getScore())
                .reduce((a,b)->a+b)
                .getAsInt();

        int sum3 = studentList.stream()
                .mapToInt(s->s.getScore())
                .reduce(0,(a,b)->a+b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);


    }
}
