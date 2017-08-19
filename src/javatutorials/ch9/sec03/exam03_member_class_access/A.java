package javatutorials.ch9.sec03.exam03_member_class_access;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class A {
    class B {}


    static class C{}


    //인스턴스 필드
    B field1 = new B();
    C field2 = new C();

    //인스턴스 메소드
    void method1(){
        B var1 = new B();
        C var2  = new C();
    }

    //정적 필드
//    static B field3 = new B();         B가 인스턴스 클래스이기 때문에 객체 생성(A클래스) 없이 불가
      static C field4 = new C();            //C가  정적(static) 클래스이기 때문에 객체 생성(A클래스) 없이도 가능함

    //정적메소드
      static void method2(){
 //         B var1 = new B();  B가 인스턴스 클래스이기 때문에 객체 생성(A클래스) 없이 불가
            C var2 = new C();  //C가  정적(static) 클래스이기 때문에 객체 생성(A클래스) 없이도 가능함
      }



}
