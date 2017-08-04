package helloworld.annotation;

import java.lang.reflect.Method;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class MyhelloExam {

    public static void main(String[] args) {
        MyHello hello = new MyHello();

        try {
            Method method =  hello.getClass().getDeclaredMethod("hello");
            if (method.isAnnotationPresent(Count100.class)){
                for (int i = 0; i < 100; i++) {
                    hello.hello();
                }
            }else{
                hello.hello();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
