package javatutorials.ch15_collection_framework.sec02_array_list.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");


        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");




    }
}
