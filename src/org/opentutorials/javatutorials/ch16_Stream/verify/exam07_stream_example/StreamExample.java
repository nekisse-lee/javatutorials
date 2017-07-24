package org.opentutorials.javatutorials.ch16_Stream.verify.exam07_stream_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Nekisse_lee on 2017. 7. 19..
 */
public class StreamExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(member -> member.getJob().equals("개발자"))
                .collect(Collectors.toList());

        developers.stream().forEach(member -> System.out.println(member.getName()));
    }
}
