package helloworld.list.arraylist;

import java.util.*;

/**
 * Created by Nekisse_lee on 2017. 8. 4..
 */
public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers.indexOf(70));
    }

}
