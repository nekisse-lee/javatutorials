package inflearn_java.Pattern.singleton_pattern;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class FirstClass {
    public FirstClass() {

        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println("FirstClass");
        System.out.println("i = " + singletonClass.getI());
        singletonClass.setI(200);
        System.out.println("i + " + singletonClass.getI());
    }
}
