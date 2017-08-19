package javatutorials.ch13_generic.sec04_generic_method.exam01_generic_method;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Box<T> {
    private T t;

    public void set(T t){
        this.t =t;
    }

    public T get(){
        return t;
    }
}
