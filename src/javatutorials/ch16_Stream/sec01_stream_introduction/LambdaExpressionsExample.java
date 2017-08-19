package javatutorials.ch16_Stream.sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class LambdaExpressionsExample {
    public static void main(String[] args){
        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신용권", 90)
        );

        Stream<Student> stream =  list.stream();
        stream.forEach(s ->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });





    }
}
