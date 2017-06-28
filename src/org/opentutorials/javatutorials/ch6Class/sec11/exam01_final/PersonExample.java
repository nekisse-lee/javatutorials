package org.opentutorials.javatutorials.ch6Class.sec11.exam01_final;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("111111-1111111", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "222222=2222222";    파이널이라 바꾸지 못함
                 p1.name = "ㅇㅇㅇ";
    }
}
