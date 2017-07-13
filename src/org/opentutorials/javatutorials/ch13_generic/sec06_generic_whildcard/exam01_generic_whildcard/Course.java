package org.opentutorials.javatutorials.ch13_generic.sec06_generic_whildcard.exam01_generic_whildcard;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Course <T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity){
        this.name = name;
        students = (T[]) new Object[capacity];
    }

    public String getName(){
        return name;
    }

    public T[] getStudents(){
        return students;
    }

    public void add(T t){
        for (int i = 0; i < students.length; i++) {
            if (students[i]==null){
                students[i] = t;
                break;
            }
        }
    }

}
