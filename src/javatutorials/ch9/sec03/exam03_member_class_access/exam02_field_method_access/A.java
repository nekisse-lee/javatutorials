package javatutorials.ch9.sec03.exam03_member_class_access.exam02_field_method_access;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class A {
    int field1;
    void method1(){}


    static int field2;
    static void method2(){}


    class B{
        void method(){
            field1 = 10;
            method1();

            field2 = 10;
            method2();

        }
    }

    static class C{
        void method(){
          //  field1 = 10;     정적멤버 클래스 안에서 field1 은  인스턴스 멤버 필드 이기때문에   A클래스객체가 필요
          // method1();        정적멤버 클래스 안에서 method1() 은  인스턴스 멤버 메소드 이기때문에   A클래스객체가 필요

            field2 = 10;
            method2();
        }
    }



}
