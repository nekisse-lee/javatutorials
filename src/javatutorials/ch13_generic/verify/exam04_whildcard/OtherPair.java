package javatutorials.ch13_generic.verify.exam04_whildcard;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class OtherPair<K,V> {
    private K key;
    private V value;

    public OtherPair(K key, V value){
        this.key = key;
        this.value  = value;
    }


    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}

