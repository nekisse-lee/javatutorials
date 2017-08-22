package inflearn_java.collection.hashset;

import java.util.HashSet;

/**
 * Created by Nekisse_lee on 2017. 8. 22..
 */
public class HashsetEx {
    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student("홍길동", 3));
        hashSet.add(new Student("이순신", 6));
        hashSet.add(new Student("장보고", 8));


        Student student = new Student("이순신", 6);
        hashSet.remove(student);

        System.out.println(hashSet.toString());


    }
}
