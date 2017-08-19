package javatutorials.ch7.sec07promotion;

/**
 * Created by Nekisse_lee on 2017. 6. 10..
 */
public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        B b2 = e;
//        C c2 = d;

    }
}
