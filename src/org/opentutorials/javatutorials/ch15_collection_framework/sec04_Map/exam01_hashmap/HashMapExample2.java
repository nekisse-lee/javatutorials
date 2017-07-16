package org.opentutorials.javatutorials.ch15_collection_framework.sec04_Map.exam01_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student,Integer>();

        map.put(new Student(1,"홍길동"), 95);
        map.put(new Student(1,"홍길동"), 90);

        System.out.println("총 entry수: " + map.size());

        System.out.println(map.get(new Student(1,"홍길동")));
    }
}
