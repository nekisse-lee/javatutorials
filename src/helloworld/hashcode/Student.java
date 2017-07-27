package helloworld.hashcode;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class Student {
    String name;
    String number;
    int birthyYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return number != null ? number.equals(student.number) : student.number == null;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthyYear=" + birthyYear +
                '}';
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number =  "1234";
        s1.birthyYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number =  "1234";
        s2.birthyYear = 1995;


        if (s1.equals(s2))
            System.out.println("s1==s2");
        else
            System.out.println("s1!=s2");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
    }
}