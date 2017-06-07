package org.opentutorials.javatutorials.ch11.sec03.exam04clone;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("blue", "홍길동", "12345", 25, true);

        Member cloned = original.getMemeber();
        cloned.passworld = "67890";  //복제된객체 패스워드 교체

        System.out.println("[원본 객체의 필드]");
        System.out.println("id : " + original.id);
        System.out.println("name : " + original.name);
        System.out.println("password : " + original.passworld);
        System.out.println("age : " + original.age);
        System.out.println("adult : " + original.adult);

        System.out.println();
        System.out.println("-------------------------------");



        System.out.println("[복제 객체의 필드]");
        System.out.println("id : " + cloned.id);
        System.out.println("name : " + cloned.name);
        System.out.println("password : " + cloned.passworld);
        System.out.println("age : " + cloned.age);
        System.out.println("adult : " + cloned.adult);


    }
}
