package org.opentutorials.javatutorials.ch6.sec04;

/**
 * Created by Nekisse_lee on 2017. 6. 2..
 */
public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다");

        System.out.println(s1.equals(s2));
    }



}
