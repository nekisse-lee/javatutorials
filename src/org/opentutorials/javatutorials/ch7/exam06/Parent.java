package org.opentutorials.javatutorials.ch7.exam06;

/**
 * Created by Nekisse_lee on 2017. 5. 24..
 */
public class Parent {
    public String nation;

    public Parent(){
        this("대한민국");
        System.out.println("Parent() call");
    }

    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
