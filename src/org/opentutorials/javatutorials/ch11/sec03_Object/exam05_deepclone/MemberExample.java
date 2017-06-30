package org.opentutorials.javatutorials.ch11.sec03_Object.exam05_deepclone;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("홍길동", 25, new int[]{90,90}, new Car("소나타"));

        Member cloned = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜저";


        System.out.println("[원본 객체의 필드값]");
        System.out.println("name: " + original.name);
        System.out.println("age: " + original.age);
        for(int i=0; i<original.scores.length; i++) {
            System.out.print(original.scores[i]);
            System.out.print((i==(original.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("car: " + cloned.car.model);
        System.out.println();

        System.out.println("[복제 객체의 필드값]");
        System.out.println("name: " + cloned.name);
        System.out.println("age: " + cloned.age);
        for(int i=0; i<cloned.scores.length; i++) {
            System.out.print(cloned.scores[i]);
            System.out.print((i==(cloned.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("car: " + original.car.model);

    }
}
