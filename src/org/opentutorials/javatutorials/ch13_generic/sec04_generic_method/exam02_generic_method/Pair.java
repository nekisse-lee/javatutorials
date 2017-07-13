package org.opentutorials.javatutorials.ch13_generic.sec04_generic_method.exam02_generic_method;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}
