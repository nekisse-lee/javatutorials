package org.opentutorials.javatutorials.ch8.sec06.exam01_interface_extends;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();



    }

}
