package javatutorials.ch9.sec02.exam01_nestedclass_object;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public class A {
    A(){
        System.out.println("ClassA 객체가 생성됨");

    }


    class B{
        int field1;
        B(){
            System.out.println("B 객체가 생성됨");
        }
        void method1(){}
    }

    static class C{
        int field1;
        static int field2;
        C(){
            System.out.println("C 객체가 생성됨");
        }
        void method1(){}
        static void mehtod2(){}
    }
    void method(){
        class D {
            int field1;

            D() {
                System.out.println("D객체가 생성됨");
            }

            void method1() {}
        }

        D d = new D();
        d.field1 = 3;
        d.method1();

    }


}
