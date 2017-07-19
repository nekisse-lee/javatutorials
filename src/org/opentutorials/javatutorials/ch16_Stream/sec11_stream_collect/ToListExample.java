package org.opentutorials.javatutorials.ch16_Stream.sec11_stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Nekisse_lee on 2017. 7. 19..
 */
public class ToListExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동",10,Student.Sex.MALE),
                new Student("김수애",6,Student.Sex.FEMALE),
                new Student("신용권",10,Student.Sex.MALE),
                new Student("박수미",6,Student.Sex.FEMALE)
        );


        //남학생들만 묶어  List로 생성

        List<Student> maleList = totalList.stream()
                .filter(s ->s.getSex()==Student.Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(student -> System.out.println(student.getName()));

        System.out.println();


        //여학생들만 묶어 HashSet 생성


        Set<Student> femaleSet = totalList.stream()
                .filter(s->s.getSex()==Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));

        femaleSet.stream()
                .forEach(student -> System.out.println(student.getName()));




    }
}
