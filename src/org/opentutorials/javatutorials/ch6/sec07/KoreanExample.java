package org.opentutorials.javatutorials.ch6.sec07;

/**
 * Created by Nekisse_lee on 2017. 6. 2..
 */
public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "000000-0000000");
        System.out.println("k1.name :"+k1.name);
        System.out.println("k1.name :"+k1.ssn);

        Korean k2 = new Korean("김자바", "111111-1111111");
        System.out.println("k2.name :" + k2.name);
        System.out.println("k2.ssn :" + k2.ssn);

        System.out.println(k1.nation.equals(k2.nation));
    }
}
