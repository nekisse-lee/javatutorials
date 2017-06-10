package org.opentutorials.javatutorials.ch7.sec06protected2;

import org.opentutorials.javatutorials.ch7.sec06protected1.A;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class D extends A {
    public D(){
        super();
        this.field = "value";
        this.method();
    }

    public void method(){
        this.field = "value";
        this.method();
    }
}
