package org.opentutorials.javatutorials.ch8.sec06.exam01_interface_extends;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public class ImplementationC implements InterfaceC {


    @Override
    public void methodA() {
        System.out.println("ImplementationC-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementationC-methodB() 실행");

    }

    @Override
    public void methodC() {
        System.out.println("ImplementationC-methodC() 실행");

    }
}
