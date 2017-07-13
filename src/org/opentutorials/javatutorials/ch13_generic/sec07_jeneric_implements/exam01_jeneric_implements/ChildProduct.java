package org.opentutorials.javatutorials.ch13_generic.sec07_jeneric_implements.exam01_jeneric_implements;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class ChildProduct<K, V, C> extends Product<K, V> {
    private C company;


    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
