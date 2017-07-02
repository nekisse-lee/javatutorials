package org.opentutorials.javatutorials.ch11.sec11_Arrays.exam01_arrays;

import java.util.Arrays;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class SearchExample {
    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("찾은 인덱스 :" + index);

        String[] names = {"홍길동", "박동수", "김민수"};
        Arrays.sort(names);
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println("찾은 인덱스 :" + index);

        Member m1  = new Member("홍길동");
        Member m2  = new Member("박동수");
        Member m3  = new Member("김민수");
        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        index = Arrays.binarySearch(members , m1);
        System.out.println("찾은 인덱스 :" + index);



    }
}
