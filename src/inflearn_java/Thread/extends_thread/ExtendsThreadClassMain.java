package inflearn_java.Thread.extends_thread;

/**
 * Created by Nekisse_lee on 2017. 8. 23..
 */
public class ExtendsThreadClassMain {
    public static void main(String[] args) {

        ExtendsThreadClass extendsThreadClass = new ExtendsThreadClass();

        extendsThreadClass.setName("B");

        extendsThreadClass.start();

        System.out.println(Thread.currentThread().getName());

    }
}
