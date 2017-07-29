package org.opentutorials.javatutorials.overloading.example1;
public class OverloadingDemo {
    void A (){System.out.println("void ClassA()");}
    void A (int arg1){System.out.println("void ClassA (int arg1)");}
    void A (String arg1){System.out.println("void ClassA (String arg1)");}
    //int ClassA (){System.out.println("void ClassA()");}
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}