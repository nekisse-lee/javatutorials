package inflearn_java.studentEx;

import java.util.ArrayList;

/**
 * Created by Nekisse_lee on 2017. 8. 18..
 */
public class StudentExpel {
    ArrayList<Student> expelStudents;

    public StudentExpel(){
        expelStudents = new ArrayList<>();
    }

    public void addExpelStudent(String name, int age, int studentNum, String major){
        expelStudents.add(new Student(name, age, studentNum, major));
        System.out.println("재적 학생 정보 등록 완료");
    }


}
