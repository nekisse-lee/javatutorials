package org.opentutorials.javatutorials.ch13_generic.sec06_generic_whildcard.exam01_generic_whildcard;

import java.util.Arrays;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class WhildCardExample {
    public static void regiserCourse(Course<?> course){
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }


    public static void regiserCourseStudent(Course<? extends Student> course){
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void regiserCourseWorker(Course<? super Worker> course){
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("학생"));


        regiserCourse(personCourse);
        regiserCourse(workerCourse);
        regiserCourse(studentCourse);
        regiserCourse(highStudentCourse);
        System.out.println();

      //  regiserCourseStudent(personCourse);
      //  regiserCourseStudent(workerCourse);
        regiserCourseStudent(studentCourse);
        regiserCourseStudent(highStudentCourse);


        regiserCourseWorker(personCourse);
        regiserCourseWorker(workerCourse);
        //regiserCourseWorker(studentCourse);
        //regiserCourseWorker(highStudentCourse);




    }
}
