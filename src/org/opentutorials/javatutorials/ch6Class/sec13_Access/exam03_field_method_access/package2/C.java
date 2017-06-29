package org.opentutorials.javatutorials.ch6Class.sec13_Access.exam03_field_method_access.package2;


import org.opentutorials.javatutorials.ch6Class.sec13_Access.exam03_field_method_access.package1.A;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class C {
    public C(){
        A a = new A();
        a.field1 = 1;
//        a.field2 = 1;    디폴트  다른패키지라 사용불가
//        a.field3 = 1;      프라이빗

        a.method1();
//        a.method2();      디폴트  다른패키지라 사용불가
//        a.method3();       프라이

    }
}
