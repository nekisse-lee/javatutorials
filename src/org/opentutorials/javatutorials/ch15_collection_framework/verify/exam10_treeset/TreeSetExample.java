package org.opentutorials.javatutorials.ch15_collection_framework.verify.exam10_treeset;

import java.util.TreeSet;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("최고점수: " + student.score);
        System.out.println("최고점수를 받은 아이디: " + student.id);
    }
}
