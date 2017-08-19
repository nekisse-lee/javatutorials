package javatutorials.ch16_Stream.sec06_stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class SortingExample {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});

        intStream
                .sorted()
                .forEach(value -> System.out.println(value+","));
        System.out.println();

        List<Student> studentList = Arrays.asList(
                new Student("홍길동",30),
                new Student("신용권",10),
                new Student("유미선",20)
        );

        studentList.stream()
                .sorted()
                .forEach(s-> System.out.println(s.getScore()+","));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())             // 내림차순 정렬
                .forEach(s-> System.out.println(s.getScore()+","));
        System.out.println();
    }
}
