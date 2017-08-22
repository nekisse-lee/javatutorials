package inflearn_java.Pattern.singleton_pattern;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class SingletonClass {

    private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();

    public int  i = 10;


    private SingletonClass() {
    }

    public static SingletonClass getSingletonClass() {
        if (SINGLETON_CLASS_INSTANCE == null) {
            SINGLETON_CLASS_INSTANCE = new SingletonClass();
        }

        return SINGLETON_CLASS_INSTANCE;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
