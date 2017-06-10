package org.opentutorials.javatutorials.ch7.sec7promotionaccess;

/**
 * Created by Nekisse_lee on 2017. 6. 10..
 */
public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();

        parent.method2();

     //   parent.method3();

    }
}
