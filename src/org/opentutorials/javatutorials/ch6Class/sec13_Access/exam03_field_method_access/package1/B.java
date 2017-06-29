package org.opentutorials.javatutorials.ch6Class.sec13_Access.exam03_field_method_access.package1;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class B {
    public B(){
        A a = new A();
        a.field1 = 1;
        a.field2 = 1;
//        a.field3 = 1;     프라이빗

        a.method1();
        a.method2();
//        a.method3();      프라이빗

    }
}
