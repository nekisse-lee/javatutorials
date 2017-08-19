package javatutorials.ch6Class.sec13_Access.exam02_contructor_access.package1;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class A {

     A a1 = new A(true);
     A a2 = new A();
     A a3 = new A("문자열");



    public A(boolean b){}
    A(){}
    private A(String s){}
}
