package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec04.exma01_field;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class UsingThisExample {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();

        inner.method();
    }
}
