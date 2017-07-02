package org.opentutorials.javatutorials.ch11.sec11_Arrays.exam01_arrays;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class Member implements Comparable<Member> {
    String name;

    Member(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }
}
