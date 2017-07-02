package org.opentutorials.javatutorials.ch7.sec08_exam02_abstract_method;

/**
 * Created by Nekisse_lee on 2017. 7. 1..
 */
public class Fish extends Animal {

    public Fish(){
        this.kind = "어류";
    }
    @Override
    public void breathe() {
        super.breathe();
    }

    @Override
    public void sound() {

    }
}
