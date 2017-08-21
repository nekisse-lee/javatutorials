package inflearn_java.singleton_pattern;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class SecondClass {
    public SecondClass() {

        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println("SecondClass");
        System.out.println("i = " + singletonClass.getI());
    }
}
