package org.opentutorials.javatutorials.ch11.sec03.exam04clone;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class Member implements Cloneable{
    public String id;
    public String name;
    public String passworld;
    public int age;
    public boolean adult;


    public Member(String id, String name, String passworld, int age, boolean adult){
        this.id = id;
        this.name = name;
        this.passworld = passworld;
        this.age = age;
        this.adult = adult;
    }


public Member getMemeber() {
    Member cloned = null;
    try {
        cloned = (Member) clone();
    } catch (CloneNotSupportedException e) {}
    return cloned;
    }
}
