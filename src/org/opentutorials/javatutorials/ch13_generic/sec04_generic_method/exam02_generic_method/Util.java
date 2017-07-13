package org.opentutorials.javatutorials.ch13_generic.sec04_generic_method.exam02_generic_method;

import javafx.util.Pair;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey()) ;
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
