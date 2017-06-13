package org.opentutorials.javatutorials.ch7.sec08_exam02_abstract_method;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class Dog extends Animal{

    public Dog(){
        this.kind = "포유류";
    }


    @Override
    public void sound() {
        System.out.println("멍멍");
    }


}
