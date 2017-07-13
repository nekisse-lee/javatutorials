package org.opentutorials.javatutorials.ch13_generic.sec03_multitype_parameter.exam01_multi_type_parameter;

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
