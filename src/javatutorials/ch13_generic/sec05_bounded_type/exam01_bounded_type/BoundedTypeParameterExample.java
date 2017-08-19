package javatutorials.ch13_generic.sec05_bounded_type.exam01_bounded_type;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        // int result1 = Util.compare("a","b");  (x)

        int result1 = Util.compare(10,20);

        System.out.println(result1);

        int result2 = Util.compare(4.5,3);
        System.out.println(result2);
    }
}
