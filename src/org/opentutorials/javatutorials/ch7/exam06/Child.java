package org.opentutorials.javatutorials.ch7.exam06;

/**
 * Created by Nekisse_lee on 2017. 5. 24..
 */
public class Child extends Parent{
    private  String name;

    public Child(){
        this("홍길동");
        System.out.println("Child() call");
    }
    public  Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }

}
