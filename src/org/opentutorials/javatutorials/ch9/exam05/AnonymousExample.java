package org.opentutorials.javatutorials.ch9.exam05;

/**
 * Created by Nekisse_lee on 2017. 5. 28..
 */
public class AnonymousExample {
    public static void main(String[] args) {
       Anonymous anony = new Anonymous();
       anony.field.run();
       anony.method1();
       anony.method2(new Vehicle() {
           @Override
           public void run() {
               System.out.println("트럭이 달립니다");
           }
       });
       
    }
}
