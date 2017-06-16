package org.opentutorials.javatutorials.ch8.sec07.exam02_default_method_extends;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public interface ParentInterface {
    public void method1();

    public default void method2(){
        System.out.println("ParentInterface-method2()");
    }
}
