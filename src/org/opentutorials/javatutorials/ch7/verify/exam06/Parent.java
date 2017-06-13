package org.opentutorials.javatutorials.ch7.verify.exam06;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class Parent {
    public String nation;

    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
