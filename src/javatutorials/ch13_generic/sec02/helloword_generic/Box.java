package javatutorials.ch13_generic.sec02.helloword_generic;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class Box<E> {
    private E obj;


    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}
