package javatutorials.ch15_collection_framework.sec02_array_list.exam01_array_lest;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class ArraysAsListExample {
    public static void main(String[] args){
        List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");

        for (String name : list1){
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(new Integer(1), 2 , 3);

        for (int value : list2){
            System.out.println(value);
        }

    }
}
