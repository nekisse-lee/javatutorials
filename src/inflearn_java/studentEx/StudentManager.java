package inflearn_java.studentEx;

import java.util.ArrayList;

/**
 * Created by Nekisse_lee on 2017. 8. 18..
 */
public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    StudentExpel studentExpel = new StudentExpel();

    private void addStudent(String name, int age, int studentNum, String major){
        students.add(new Student(name, age, studentNum, major));
        System.out.println(name + "학생 정보 입력 성공!!!");
    }


    public static void main(String[] args) {

        StudentManager magaer = new StudentManager();

        magaer.addStudent("홍길동", 24, 23131323, "연극영화");
        magaer.addStudent("동", 14, 24441323, "영화");
        magaer.addStudent("방세", 44, 244443, "영화");
        magaer.addStudent("서병", 24, 2528843, "연극");

    }

}
