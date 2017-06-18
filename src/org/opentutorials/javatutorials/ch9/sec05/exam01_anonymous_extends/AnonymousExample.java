package org.opentutorials.javatutorials.ch9.sec05.exam01_anonymous_extends;

/**
 * Created by Nekisse_lee on 2017. 6. 18..
 */
public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.field.wake();

        anony.method1();

        anony.method2(new Person(){
            String studentNo;
            void study(){
                System.out.println("공부  합니다.");
            }
            @Override
            void wake(){
                System.out.println("8 시에 일어납니다.");
                study();
            }
        });


    }
}
