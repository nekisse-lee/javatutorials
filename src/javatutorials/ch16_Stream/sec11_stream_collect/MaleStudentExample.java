package javatutorials.ch16_Stream.sec11_stream_collect;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 19..
 */
public class
MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 6, Student.Sex.FEMALE),
                new Student("신용권", 10, Student.Sex.MALE),
                new Student("박수미", 6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s->s.getSex()==Student.Sex.MALE)
                .collect(
                        () -> new MaleStudent(),
                        (r,t)->r.accumulate(t),
                        (r1,r2)->r1.combine(r2));

        maleStudent.getList().stream()
                .forEach(student -> System.out.println(student.getName()));


    }
}
