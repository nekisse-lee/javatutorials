package javatutorials.ch16_Stream.verify.exam06_StreamExample;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 19..
 */
public class StreamExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동",30),
                new Member("신용권",40),
                new Member("감자바",26)
        );


        double avg = list.stream()
                .mapToInt(s->s.getAge())  //Member::getAge
                .average()
                .getAsDouble();


        System.out.println("평균나이: " + avg);
    }
}
