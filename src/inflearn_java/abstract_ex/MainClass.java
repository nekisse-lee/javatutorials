package inflearn_java.abstract_ex;

/**
 * Created by Nekisse_lee on 2017. 8. 20..
 */
public class MainClass {
    public static void main(String[] args) {
        B b = new B();
        b.methodE();

        A bb = new B();

        System.out.println();
        bb.methodE();
    }

}
