package org.opentutorials.javatutorials.ch15_collection_framework.verify.exam08_hash;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        if (studentNum != student.studentNum) return false;
        return true;
    }
}
