package org.opentutorials.javatutorials.ch9.sec03.exam03_member_class_access.exam03_localclass_access;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class Outter {
    //자바 7 이전        final 붙이지 않으  컴파일애러
    public void method1(final int arg){
        final int localVariable = 1;
        class Inner{
            void method(){
           //     int arg = 10;              final을 붙임으로서  ** 로컬클래스의  메소드의  로컬 변수로 복사  **   힙에남아서 이용??
           //     int localVriable = 1;         final을 붙임으로서 **로컬클래스의  메소드의  로컬 변수로 복사 **   힙에남아서 이용??
                int result = arg + localVariable;
            }
        }
    }

    //자바 8 이후

    //final 생략가능      ***생략한경우   로컬 클래스의 field로 복사 ***
    //  7처럼 final 을 붙여준 경우     **로컬클래스의  메소드의  로컬 변수로 복사**
      public void method2(int arg){
        int localVariable = 1;
        class Inner{
            // int arg = 10;                   로컬 클래스의 필드로 복사
            // int lovalVriable = 1;            로컬 클래스의 필드로 복사
           void method(){
                int result = arg + localVariable;
            }
        }
      }

}
