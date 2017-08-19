package javatutorials.ch13_generic.sec07_jeneric_implements.exam01_jeneric_implements;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public interface Storage <T> {
    public void add(T item, int index);
    public T get(int index);
}
