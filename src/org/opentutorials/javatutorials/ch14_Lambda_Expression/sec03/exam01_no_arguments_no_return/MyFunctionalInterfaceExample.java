package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec03.exam01_no_arguments_no_return;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class MyFunctionalInterfaceExample {
    public static void main(String[] args){
        MyFunctionalInterface fi;

        fi = ()->{
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = ()->{System.out.println("method call2"); };
        fi.method();

        fi = ()-> System.out.println("method call3");  //실행문 하나일시 중괄호 제거
        fi.method();

        fi = new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("method call4");
            }
        };
        fi.method();
    }
}
