package org.opentutorials.javatutorials.ch13_generic.sec07_jeneric_implements.exam01_jeneric_implements;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class StorageImpl<T> implements Storage<T> {

    private T[] array;

    public StorageImpl(int capacity){
        array = (T[]) new Object[capacity];
    }
    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {

        return array[index];
    }
}
