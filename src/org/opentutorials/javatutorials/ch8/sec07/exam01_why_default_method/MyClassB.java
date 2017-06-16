package org.opentutorials.javatutorials.ch8.sec07.exam01_why_default_method;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public class MyClassB implements MyInterface{
    @Override
    public void method1() {
        System.out.println("MyClassB-method1() 실행");
    }

    @Override
    public void method2() {
        System.out.println("MyClassB-mehtod2() 실행");
    }
}
