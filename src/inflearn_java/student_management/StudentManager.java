package inflearn_java.student_management;

import java.util.ArrayList;

/**
 * Created by Nekisse_lee on 2017. 8. 18..
 */
public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    StudentExpel studentExpel = new StudentExpel();


    private void addStudent(String name, int age, int studentNum, String major) {
        //
        students.add(new Student(name, age, studentNum, major));
        System.out.println(name + " 학생 정보 입력 성공!!");
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("홍길동", 22, 20123487, "연극영화");
        manager.addStudent("홍길순", 21, 2445487, "영화");
        manager.addStudent("길동", 32, 2552487, "화");
        manager.addStudent("동", 45, 20123487, "연");

        System.out.println(manager.students.get(0).getName());
        System.out.println(manager.students.get(0).getAge());
        System.out.println(manager.students.get(0).getStudentNum());
        System.out.println(manager.students.get(0).getMajor());

        manager.students.get(0).updateInfo(1,"홍길똥");

        System.out.println(manager.students.get(0).getName());
    }
}
