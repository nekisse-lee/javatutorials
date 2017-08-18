package inflearn_java.studentEx;

/**
 * Created by Nekisse_lee on 2017. 8. 18..
 */
public class Student {
    private String name;
    private int age;
    private int studentNum;
    private String major;

    public Student(String name, int age, int studentNum, String major) {
        this.name = name;
        this.age = age;
        this.studentNum = studentNum;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
