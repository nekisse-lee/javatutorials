package org.opentutorials.javatutorials.ch13_generic.verify.exam04_whildcard;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Util {
    //how1
   /* public static <K,V> V getValue(Pair<K,V> p, K k){
        If (p.getKey()==k){
            return p.getValue();
        }else{
            return null;
        }
    }*/

    //how2
    public static <P extends Pair<K, V>, K,V> V getValue(P p, K k){
        if (p.getKey()==k){
            return p.getValue();
        }else{
            return null;
        }
    }

}
