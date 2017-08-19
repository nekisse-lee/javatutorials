package javatutorials.ch16_Stream.sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)

        );

        double avg = studentList.stream()
                .mapToInt(s->s.getScore())  //  ->Student::getScore
                .average()
                .getAsDouble();

        System.out.println("평균점수: " + avg);

    }
}
