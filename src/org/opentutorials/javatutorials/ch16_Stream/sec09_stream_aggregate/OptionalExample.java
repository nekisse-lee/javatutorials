package org.opentutorials.javatutorials.ch16_Stream.sec09_stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

       /* double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();*/

        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optionalDouble.isPresent()){
            System.out.println("방법1_평균: " + optionalDouble.getAsDouble());
        }else{
            System.out.println("방법1_평규: 0.0");
        }

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("방법2_평균: " + avg);


        list.add(2);
        list.add(4);
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균: " + a));
    }
}
