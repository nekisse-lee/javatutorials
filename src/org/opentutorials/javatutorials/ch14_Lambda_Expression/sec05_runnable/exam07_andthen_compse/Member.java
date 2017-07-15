package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec05_runnable.exam07_andthen_compse;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class Member {
    private String name;
    private String id;
    private Address adress;

    public Member(String name, String id, Address address){
        this.name = name;
        this.id = id;
        this.adress = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAdress() {
        return adress;
    }
}
