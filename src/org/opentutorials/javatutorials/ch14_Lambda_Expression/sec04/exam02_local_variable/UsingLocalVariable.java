package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec04.exam02_local_variable;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class UsingLocalVariable {
    void method(int arg){
        int localVar = 40;

       // arg = 31;   final 특성 변경 불가
       // localVar = 41; final 특성  변경 불가

        MyFunctionalInterface fi = () -> {
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar);
        };

        fi.method();
    }
}
