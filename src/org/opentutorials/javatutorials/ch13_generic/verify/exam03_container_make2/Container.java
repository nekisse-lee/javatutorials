package org.opentutorials.javatutorials.ch13_generic.verify.exam03_container_make2;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Container< K , V> {
    private K key;
    private V value;


    public void set(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getkey(){
        return key;
    }

    public V getValue(){
        return value;
    }


}
