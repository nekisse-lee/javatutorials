package org.opentutorials.javatutorials.ch13_generic.sec07_jeneric_implements.exam01_jeneric_implements;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Product<T, M> {
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

}

 class Tv{}
