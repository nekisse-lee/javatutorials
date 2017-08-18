package inflearn_java.student_management;

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

    public  void updateInfo(int i, String info){
        switch (i){
            case 1:
                setName(info);
                break;
            case 2:
                setAge(Integer.parseInt(info));
                break;
            case 3:
                setStudentNum(Integer.parseInt(info));
                break;
            case 4:
                setMajor(info);
                break;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

