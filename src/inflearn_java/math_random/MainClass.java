package inflearn_java.math_random;

import java.util.Random;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class MainClass {
    public static void main(String[] args) {
        double d = Math.random();
        System.out.println(d);
        int di = (int)(d*10);
        System.out.println(di);

        Random random = new Random();


        int i = random.nextInt(100);
        System.out.println(i);


        Integer integer = new Integer(10);
        int j = integer.intValue();
        System.out.println(j);
    }
}
