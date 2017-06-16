package org.opentutorials.javatutorials.ch9.sec02.exam01_nestedclass_object;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public class Main {
    public static void main(String[] args) {
            A a = new A();

           A.B b = a.new B();
           b.field1 = 3;
           b.method1();


           A.C c = new A.C();
           c.field1 = 3;
           c.method1();
           A.C.field2 = 3;
           A.C.mehtod2();

           a.method();
    }
}
