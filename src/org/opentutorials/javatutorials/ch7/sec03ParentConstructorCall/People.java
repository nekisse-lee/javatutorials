package org.opentutorials.javatutorials.ch7.sec03ParentConstructorCall;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class People {
    public String name;
    public String ssn;

    public People(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
        System.out.println("부모객체 생성완료");
    }
}
