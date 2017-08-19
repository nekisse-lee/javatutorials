package javatutorials.ch16_Stream.sec05_stream_mapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        studentList.stream()
        .mapToInt(Student::getScore)
        .forEach(score-> System.out.println(score));
    }
}
