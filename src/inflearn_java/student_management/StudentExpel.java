package inflearn_java.student_management;


import java.util.ArrayList;

/**
 * Created by Nekisse_lee on 2017. 8. 18..
 */
public class StudentExpel {

    ArrayList<Student> expelStudents;

    public StudentExpel() {
        expelStudents = new ArrayList<Student>();
    }

    public void addExpelStudent(String name, int age, int studentNum, String major){
        expelStudents.add(new Student(name, age, studentNum, major));
    }
}
