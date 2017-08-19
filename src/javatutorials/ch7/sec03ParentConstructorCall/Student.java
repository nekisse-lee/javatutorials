package javatutorials.ch7.sec03ParentConstructorCall;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class Student extends People {
    public int studentNo;
    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);
        this.studentNo = studentNo;
        System.out.println("자식객체 생성완료");
    }
}
