package javatutorials.ch11.sec04_Objects.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class CompareExample {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);
        Student s3 = new Student(2);
        int result= Objects.compare(s1, s2, new StudentComparator() );
        System.out.println(result);



        result= Objects.compare(s3, s1, new StudentComparator() );
        System.out.println(result);
    }


    static class Student{
        int sno;
        Student( int sno){
            this.sno = sno;
        }
    }

    static class StudentComparator implements Comparator<Student>{

        @Override
        public int compare(Student a, Student b) {
            /*If (a.sno < b.sno){
                return -1;
            }else If (a.sno == b.sno){
                return 0;
            }else {
                return 1;
            }*/
            return Integer.compare(a.sno, b.sno);

        }
    }

}
