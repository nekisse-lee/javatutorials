package org.opentutorials.javatutorials.ch15_collection_framework.verify.exam08_hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.studentNum + ":" + student.name);
        }
    }
}
