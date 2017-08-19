package javatutorials.ch13_generic.sec04_generic_method.exam01_generic_method;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Util {

    public static <T> Box<T> boxsing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
     }

}
