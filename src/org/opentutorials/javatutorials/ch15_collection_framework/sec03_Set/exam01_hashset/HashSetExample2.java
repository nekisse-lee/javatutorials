package org.opentutorials.javatutorials.ch15_collection_framework.sec03_Set.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        //객체가 달라도 동등객체기 떄문에 저장 불가.

        System.out.println("총 객체 수 " + set.size());
    }
}
