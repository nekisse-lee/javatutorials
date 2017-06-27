package org.opentutorials.javatutorials.ch6Class.sec04.exam01_class_new;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1변수가 Student 객체를 참조 합니다.");

        Student s2 = new Student();
        System.out.println("s2변수가 또 다른 Student 객체를 참조 합니다.");


        System.out.println(s1==s2);

    }
}
